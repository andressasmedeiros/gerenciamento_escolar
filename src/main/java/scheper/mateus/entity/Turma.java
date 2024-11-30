package scheper.mateus.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(schema = "base", name = "turma")
@Getter
@Setter
public class Turma {
    @Id
    @GeneratedValue
    @Column(name = "id_turma")
    @SequenceGenerator(name = "turma_id_seq", sequenceName = "base.turma_id_seq")
    private Long idTurma;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Date inicio;

    @Column(nullable = false)
    private Date termino;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            schema = "base",
            name = "turma_unidade_curricular",
            joinColumns = { @JoinColumn(name = "id_turma") },
            inverseJoinColumns = { @JoinColumn(name = "id_unidade_curricular") }
    )
    private List<UnidadeCurricular> unidadesCurriculares = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            schema = "base",
            name = "turma_estudante",
            joinColumns = { @JoinColumn(name = "id_turma") },
            inverseJoinColumns = { @JoinColumn(name = "id_estudante") }
    )
    private List<Estudante> estudantes = new ArrayList<>();

    @Column(name = "quantidade_minima_estudantes", nullable = false)
    private Integer quantidadeMinimaEstudantes;

    @Column(name = "quantidade_maxima_estudantes", nullable = false)
    private Integer quantidadeMaximaEstudantes;

}


