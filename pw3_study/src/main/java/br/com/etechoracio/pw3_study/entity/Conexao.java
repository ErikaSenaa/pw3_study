package br.com.etechoracio.pw3_study.entity;
//Erika Sena e Jeniffer Soares
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
@Setter
@Getter
@Entity
    @Table(name = "TBL_CONEXAO")
public class Conexao {
        @Id
        @Column(name = "ID_CONEXAO")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "ID_MONITOR")
        private Monitor idmonitor;

        @Column(name = "DT_CRIACAO")
        private LocalDateTime dataCriacao;

}
