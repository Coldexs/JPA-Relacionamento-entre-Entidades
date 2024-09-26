package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Compartilhamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Usuário que compartilhou
    @ManyToOne
    private Usuario compartilhadoPor;

    // Usuário que recebeu
    @ManyToOne
    private Usuario recebidoPor;

    // Relacionamento com a Playlist, conforme diagrama
    @ManyToOne
    private Playlist playlist;

    // Relacionamento com o Nível de Acesso, conforme diagrama
    @ManyToOne
    private NivelDeAcesso nivelDeAcesso;

}
