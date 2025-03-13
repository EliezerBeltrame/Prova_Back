package com.example.avaliacao.Model;

public class Livro {
    private long idlivro;
    private String nome;
    private String autor;
    private String genero;

    public Livro(long idlivro, String nome, String autor, String genero) {
        this.idlivro = idlivro;
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
    }

    public long getIdlivro() {
        return idlivro;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setIdlivro(long idlivro) {
        this.idlivro = idlivro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
