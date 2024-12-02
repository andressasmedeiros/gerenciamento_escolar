package scheper.mateus.service;

import scheper.mateus.business.TurmaBusiness;
import scheper.mateus.dto.CadastroTurmaDTO;
import scheper.mateus.exception.BusinessException;

import javax.inject.Inject;
import java.io.Serial;
import java.io.Serializable;

public class TurmaService implements Serializable {
    @Serial
    private static final long serialVersionUID = 98438536585L;

    @Inject
    private TurmaBusiness turmaBusiness;

    public void cadastrarTurma(CadastroTurmaDTO turma) throws BusinessException {
        turmaBusiness.cadastrarTurma(turma);
    }
}
