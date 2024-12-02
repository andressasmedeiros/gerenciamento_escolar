package scheper.mateus.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class CadastroTurmaDTO implements Serializable{
    @Serial
    private static final long serialVersionUID = 11733897925L;

    private String nome;

    private Date inicio;

    private Date termino;

    private Integer quantidadeMinimaEstudantes;

    private Integer quantidadeMaximaEstudantes;
}
