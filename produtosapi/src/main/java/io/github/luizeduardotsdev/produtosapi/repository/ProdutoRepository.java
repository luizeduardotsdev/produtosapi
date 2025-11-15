package io.github.luizeduardotsdev.produtosapi.repository;

import io.github.luizeduardotsdev.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,String> {
}
