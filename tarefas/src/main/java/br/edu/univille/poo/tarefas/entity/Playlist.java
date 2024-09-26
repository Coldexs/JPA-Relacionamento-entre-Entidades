package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Relacionamento com a entidade Musica
    @OneToMany
    @JoinColumn(name = "playlist_id") // Cria a chave estrangeira na tabela Musica
    private List<Musica> musicas;

    // Relacionamento com o Usuario que criou a Playlist
    @ManyToOne
    private Usuario usuario;
}
