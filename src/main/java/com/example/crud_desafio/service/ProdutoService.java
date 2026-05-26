package com.example.crud_desafio.service;

import com.example.crud_desafio.entity.Produto;
import com.example.crud_desafio.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public Produto salvar(Produto produto){
        return repository.save(produto);
    }

    public List<Produto> listar(){
        return repository.findAll();
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }
}
