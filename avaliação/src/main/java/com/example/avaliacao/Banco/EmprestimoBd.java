package com.example.avaliacao.Banco;

import com.example.avaliacao.Model.Emprestimos;
import com.example.avaliacao.Model.Livro;


import java.util.ArrayList;
import java.util.List;

    public  class EmprestimoBd{
    public List<Livro> livros;
    public List<Emprestimos> emprestimos;

    public EmprestimoBd() {
        this.livros = new ArrayList<>();
    }

    public List<Livro> findAll() {
        return new ArrayList<>(livros);
    }

    public Emprestimos getById(Long id) {
        return new Emprestimos().stream()
                .filter(emp -> emp.get() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean insert(Livro livros) {
        EmprestimoBd.this.livros.add((Emprestimos) EmprestimoBd.this.livros);
        return true;
    }
    public  List<Livro> findByDepartamento(String livros){
        return livros.stream()
            .filter(emp -> emp.getlivro().getNome()
                    .equals(emp))
            .toList();

    public boolean update(long id, Livro livros) {
        Emprestimos EmprestimosBd = getById(livros.getIdlivro()).this.livros.stream()
                .filter(emp -> emp.getIdlivro() == id)
                .findFirst()
                .orElse(null);

        if (EmprestimosBd == null) {
            return false;
        }
        EmprestimosBd.setClientepagos(EmprestimoBd.this.livros.get(EmprestimoBd.this.livros);

        return true;

    }
    public boolean delete(long id) {
        Emprestimos EmprestimosBd = livros.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
        if (EmprestimosBd == null) {
            return false;
        }
        Livro.remove(Livro);
        return true;
    }

    }
}






