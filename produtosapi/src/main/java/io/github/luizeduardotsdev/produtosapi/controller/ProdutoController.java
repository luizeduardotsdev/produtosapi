package io.github.luizeduardotsdev.produtosapi.controller;

import io.github.luizeduardotsdev.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @PostMapping ("/salvar")
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Salvando produto: " + produto);
        return produto;
    }

}
