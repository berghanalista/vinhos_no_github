
package com.berghgustavoarianadayane.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produto implements Serializable{
    
    private static final long serialVersionUID = 2806421523585360625L;
    
    private Long id;
    private String vinicula;
    private Integer teorAlcoolico;
    private String origem;
    private BigDecimal preco;

    public Produto(Long id, String vinicula, Integer teorAlcoolico, String origem, BigDecimal preco) {
        this.id = id;
        this.vinicula = vinicula;
        this.teorAlcoolico = teorAlcoolico;
        this.origem = origem;
        this.preco = preco;
    }

    public Produto() {
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVinicula() {
        return vinicula;
    }

    public void setVinicula(String vinicula) {
        this.vinicula = vinicula;
    }

    public Integer getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(Integer teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
    
}
