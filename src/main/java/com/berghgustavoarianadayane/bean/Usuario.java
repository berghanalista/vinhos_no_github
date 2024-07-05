
package com.berghgustavoarianadayane.bean;

import java.io.Serializable;

/**
 *
 * @author berghlinux
 */
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String nome;
    private String senha;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
