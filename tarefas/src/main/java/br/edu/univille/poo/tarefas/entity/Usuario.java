package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Atributos adicionais
    private String nome;
    private String email;
    private String senha;

    // Relacionamento com Perfil (Um usuário possui um perfil)
    @OneToOne
    private Perfil perfil;

    // Método para verificar se o email é válido
    public boolean emailValido() {
        // Simples validação de email (verificação de presença de "@" e ".")
        return email != null && email.contains("@") && email.contains(".");
    }

    // Método para verificar se a senha é segura (no mínimo 8 caracteres)
    public boolean senhaSegura() {
        return senha != null && senha.length() >= 8;
    }
}
