package com.example.crud_desafio.repository;

import com.example.crud_desafio.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {


}
