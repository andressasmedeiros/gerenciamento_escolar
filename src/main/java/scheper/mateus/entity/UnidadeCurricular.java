package scheper.mateus.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(schema = "base", name = "unidade_curricular")
@Getter
@Setter
public class UnidadeCurricular {

    @Id
    @GeneratedValue
    @Column(name = "id_unidade_curricular")
    @SequenceGenerator(name = "unidade_curricular_id_seq", sequenceName = "base.unidade_curricular_id_seq")
    private Long idUnidadeCurricular;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, name = "carga_horaria")
    private Integer cargaHoraria;

}
