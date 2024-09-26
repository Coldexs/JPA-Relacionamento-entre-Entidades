package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;  // Título do álbum
    private String anoLancamento;  // Ano de lançamento do álbum
    private String genero;  // Gênero musical do álbum

    @ManyToOne
    private Autor autor;  // Autor/criador do álbum

    @OneToMany(mappedBy = "album")
    private List<Musica> musicas;  // Lista de músicas contidas no álbum
}
