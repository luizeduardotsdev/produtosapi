package io.github.luizeduardotsdev.produtosapi.controller;

import io.github.luizeduardotsdev.produtosapi.model.Produto;
import io.github.luizeduardotsdev.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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

        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);

        return produto;
    }

    @GetMapping("/{id}")
    public Produto buscarPorId(@PathVariable("id") String id){

        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarPorID(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }



}
