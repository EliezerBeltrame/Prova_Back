package com.example.avaliacao.Model;

import java.util.ArrayList;

public class Emprestimos {
    private  long idemprestimo;
    private long dataInicio;
    private long dataFim;
    private String livrosemprestados;
    private ArrayList<Cliente> clientepagos;

    public Emprestimos(long idemprestimo, long dataInicio, long dataFim, String livrosemprestados, ArrayList<Cliente> clientepagos) {
        this.idemprestimo = idemprestimo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.livrosemprestados = livrosemprestados;
        this.clientepagos = clientepagos;
    }

    public long getIdemprestimo() {
        return idemprestimo;
    }

    public long getDataInicio() {
        return dataInicio;
    }

    public long getDataFim() {
        return dataFim;
    }

    public String getLivrosemprestados() {
        return livrosemprestados;
    }

    public ArrayList<Cliente> getClientepagos() {
        return clientepagos;
    }

    public void setIdemprestimo(long idemprestimo) {
        this.idemprestimo = idemprestimo;
    }

    public void setDataInicio(long dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(long dataFim) {
        this.dataFim = dataFim;
    }

    public void setLivrosemprestados(String livrosemprestados) {
        this.livrosemprestados = livrosemprestados;
    }

    public void setClientepagos(ArrayList<Cliente> clientepagos) {
        this.clientepagos = clientepagos;
    }
}
