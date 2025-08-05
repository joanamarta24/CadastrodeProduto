package controller;

import dto.ProdutoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }
    @PostMapping
    public ResponseEntity<Produto> cadastrarProduto(@Valid @RequestBody Produto produto){
            @Valid @RequestBody ProdutoDTO produtoRequestDTO,
            UriComponentsBuilder uriComponentsBuilder
            ){
        Produto produto = new  Produto(produtoRequestDTO.nome(),
                produtoRequestDTO.preco(), produtoRequestDTO.emEstoque());
    }
        return null;
    }
