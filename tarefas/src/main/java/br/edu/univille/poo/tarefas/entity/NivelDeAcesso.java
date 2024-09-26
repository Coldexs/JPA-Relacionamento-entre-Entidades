package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class NivelDeAcesso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Definindo o nome do nível de acesso (por exemplo: "leitura", "edição", "administração")
    private String descricao;

    // Método para verificar se o acesso permite edição
    public boolean permiteEdicao() {
        return "edição".equalsIgnoreCase(descricao) || "administração".equalsIgnoreCase(descricao);
    }

    // Método para verificar se o acesso é apenas leitura
    public boolean somenteLeitura() {
        return "leitura".equalsIgnoreCase(descricao);
    }
}
