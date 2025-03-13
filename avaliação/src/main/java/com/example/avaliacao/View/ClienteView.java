package com.example.avaliacao.View;


import com.example.avaliacao.Controller.ClienteController;
import com.example.avaliacao.Model.Emprestimos;
import com.example.avaliacao.Model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Emprestimo")
public class ClienteView{
    ClienteController clienteController = new ClienteController();

    @GetMapping
    public List<Emprestimos> getById() {
        return clienteController.getAll();
    }

    @GetMapping("/{id}")
    public Livro getById(@PathVariable long id) {
        return clienteController.getById(id);
    }

    @PostMapping
    public boolean insert(@RequestBody Livro livro) {
        return clienteController.insert(livro);
    }

    @PutMapping("/{id}")
    public Livro update(@RequestBody Livro departamento, @PathVariable long id) {
        return clienteController.update(departamento.getIdlivro();
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable String idlivro){
        return clienteController.delete(idlivro);
    }

    @PutMapping("/{id}")
    public boolean atualizar(@RequestBody String idcliente){
        return  clienteController.update(data)
    }
    @PutMapping("/{id}")
    public boolean remover(@RequestBody String )


}

