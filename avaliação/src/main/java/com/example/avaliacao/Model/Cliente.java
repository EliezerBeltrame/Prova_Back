package com.example.avaliacao.Model;

public class Cliente {
    private long idcliente;
    private String nome;
    private long cpf;
    private int telefone;
    private long email;

    public Cliente(long idcliente, String nome, long cpf, int telefone, long email) {
        this.idcliente = idcliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public long getIdcliente() {
        return idcliente;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public long getEmail() {
        return email;
    }

    public void setIdcliente(long idcliente) {
        this.idcliente = idcliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEmail(long email) {
        this.email = email;
    }
}