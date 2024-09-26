package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;  // Nome do autor
    private String nacionalidade;  // Nacionalidade do autor

    // Relacionamento com a entidade Musica ou Livro
    @OneToMany(mappedBy = "autor")
    private List<Musica> musicas;  // Lista de músicas compostas pelo autor

    @OneToMany(mappedBy = "autor")
    private List<Album> albuns;  // Lista de álbuns criados pelo autor
}
