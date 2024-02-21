package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Gerente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String nome;
    private String senha;
    private double quantidadeFuncionario;

    public Gerente() {
    }

    public Gerente(String nome, String senha, double quantidadeFuncionario) {
        this.nome = nome;
        this.senha = senha;
        this.quantidadeFuncionario = quantidadeFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getQuantidadeFuncionario() {
        return quantidadeFuncionario;
    }

    public void setQuantidadeFuncionario(double quantidadeFuncionario) {
        this.quantidadeFuncionario = quantidadeFuncionario;
    }
}
