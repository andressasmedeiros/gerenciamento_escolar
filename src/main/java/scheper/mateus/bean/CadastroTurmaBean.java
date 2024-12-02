package scheper.mateus.bean;

import lombok.Getter;
import lombok.Setter;
import org.omnifaces.cdi.ViewScoped;
import scheper.mateus.dto.CadastroTurmaDTO;
import scheper.mateus.exception.BusinessException;
import scheper.mateus.service.TurmaService;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serial;
import java.io.Serializable;

import static scheper.mateus.utils.MessageUtils.returnMessageOnFail;
import static scheper.mateus.utils.MessageUtils.returnMessageOnSuccess;

@Named
@ViewScoped
public class CadastroTurmaBean implements Serializable {
    @Serial
    private static final long serialVersionUID = 4891536845L;

    @Inject
    private TurmaService turmaService;

    @Getter
    @Setter
    private CadastroTurmaDTO turma = new CadastroTurmaDTO();

    public void cadastrar() {
        try {
            turmaService.cadastrarTurma(turma);
            returnMessageOnSuccess("Turma cadastrada com sucesso.");
        } catch (BusinessException e){
            returnMessageOnFail(e.getMessage());
        }
    };
}
