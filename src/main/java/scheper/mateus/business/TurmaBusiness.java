package scheper.mateus.business;

import org.apache.commons.lang3.StringUtils;
import scheper.mateus.dto.CadastroTurmaDTO;
import scheper.mateus.exception.BusinessException;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
public class TurmaBusiness {

    public void cadastrarTurma(CadastroTurmaDTO turma) throws BusinessException {
        validarCadastrarTurma(turma);
        criarOuEditarTurma(turma);
    }

    private void criarOuEditarTurma(CadastroTurmaDTO turma) {
    }

    private void validarCadastrarTurma(CadastroTurmaDTO turma) throws BusinessException {
        List<String> erros = new ArrayList<>();
        if (StringUtils.isEmpty(turma.getNome())){
            erros.add("O nome da turma não pode ser vazio");
        }
        if (turma.getInicio()==null){
            erros.add("A data de início não pode ser vazia");
        }
        if (turma.getTermino()==null){
            erros.add("A data de término não pode ser vazia");
        }
        if (turma.getInicio() != null
                && turma.getTermino() != null
                && turma.getInicio().after(turma.getTermino())){
            erros.add("A data de início não deve ser posterior a data de término");
        }
        if (turma.getQuantidadeMinimaEstudantes() == null){
            erros.add("A quantidade mínima de estudantes não pode ser vazia");
        } else if (turma.getQuantidadeMinimaEstudantes() < 1){
            erros.add("A quantidade mínima deve ser maior que zero");
        }
        if (turma.getQuantidadeMaximaEstudantes() == null){
            erros.add("A quantidade máxima de estudantes não pode ser vazia");
        } else if (turma.getQuantidadeMaximaEstudantes() < 1){
            erros.add("A quantidade máxima deve ser maior que zero");
        }
        if (turma.getQuantidadeMinimaEstudantes() != null
                && turma.getQuantidadeMaximaEstudantes() != null
                && turma.getQuantidadeMinimaEstudantes() > turma.getQuantidadeMaximaEstudantes()){
            erros.add("A quantidade mínima de estuntes não deve ser maior que a quantidade máxima");
        }
        if (!erros.isEmpty()){
            throw new BusinessException(erros);
        }
    }
}
