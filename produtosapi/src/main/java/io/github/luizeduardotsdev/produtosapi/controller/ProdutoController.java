package io.github.luizeduardotsdev.produtosapi.controller;

import io.github.luizeduardotsdev.produtosapi.model.Produto;
import io.github.luizeduardotsdev.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping ("/salvar")
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Salvando produto: " + produto);
        return produto;
    }

}
