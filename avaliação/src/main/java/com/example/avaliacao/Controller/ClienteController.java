package com.example.avaliacao.Controller;

import com.example.avaliacao.Model.Emprestimos;
import com.example.avaliacao.Model.Livro;

import java.util.List;

public class ClienteController{
    EmprestimoBd repository = new EmprestimoBd();
    public List<Emprestimos> getAll(){
        return repository.findAll();
    }
    public List<Emprestimos> getByEmprestimo(Emprestimos emprestimos){
        return repository.findAll();
    }

    public  List<Emprestimos> getByDepartamento(String Emprestimos){
        return  repository.findByEmprestimo(Emprestimos);
    }

    public Emprestimos getEmprestimos(long id){
        return  repository.getById(id);
    }

    public  boolean insert(Livro livros){
        return repository.insert(livros);
    }
    public Emprestimos update(long id,Emprestimos emprestimos){
        boolean result = repository.update(id, emprestimos);

        if (result){
            return  null;
        }
        return null;
    }
    public  boolean delete(long id,Livro livors){
        return  repository.delete(idlivro);
    }

}


