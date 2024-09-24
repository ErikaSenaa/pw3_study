package br.com.etechoracio.pw3_study.entity;
//Erika Sena e Jeniffer Soaresss
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TBL_DISCIPLINA")

public class Disciplina {
    @Id
    @Column(name = "ID_DISCIPLINA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long s;

    @Column(name = "TX_NOME")
    private String nome;
}
//Erika Sena e Jeniffer Soares