package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo; // Nome ou título da música
    private int duracao;    // Duração da música em segundos

    // Relacionamento com a entidade Artista
    @ManyToOne
    private Autor autor;

    // Relacionamento com a entidade Album
    @ManyToOne
    private Album album;

    // Método para curtir uma música
    public void curtirMusica() {
        // Lógica para curtir a música
        System.out.println("Música " + titulo + " curtida!");
    }

    // Método para adicionar a música em uma playlist
    public void adicionarNaPlaylist(Playlist playlist) {
        // Lógica para adicionar a música na playlist
        playlist.getMusicas().add(this);
        System.out.println("Música " + titulo + " adicionada à playlist!");
    }
}
