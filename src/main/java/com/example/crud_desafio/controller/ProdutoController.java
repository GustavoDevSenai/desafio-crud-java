package com.example.crud_desafio.controller;


import com.example.crud_desafio.entity.Produto;
import com.example.crud_desafio.service.ProdutoService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@AllArgsConstructor
public class ProdutoController {


    private final ProdutoService service;



    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        return service.salvar(produto);
    }

    @GetMapping
    public List<Produto> listar(){
        return service.listar();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }


}
