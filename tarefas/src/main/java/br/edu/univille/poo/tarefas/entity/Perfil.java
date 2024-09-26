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
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Definindo o tipo de perfil (por exemplo: "usuário", "administrador", "moderador")
    private String nome;

    // Método para verificar se o perfil tem permissões de administrador
    public boolean isAdministrador() {
        return "administrador".equalsIgnoreCase(nome);
    }

    // Método para verificar se o perfil é de um moderador
    public boolean isModerador() {
        return "moderador".equalsIgnoreCase(nome);
    }

    // Método para verificar se o perfil é de um usuário comum
    public boolean isUsuarioComum() {
        return "usuário".equalsIgnoreCase(nome);
    }
}
