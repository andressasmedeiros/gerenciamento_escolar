package scheper.mateus.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "base", name = "estudante")
@Getter
@Setter
public class Estudante {

    @Id
    @GeneratedValue
    @Column(name = "id_estudante")
    @SequenceGenerator(name = "estudante_id_seq", sequenceName = "base.estudante_id_seq")
    private Long idEstudante;

    @Column(nullable = false)
    private String nome;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

}
