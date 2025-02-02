package br.com.sistema_ecommerce.controller;

import br.com.sistema_ecommerce.controller.dto.ProdutoDTO;
import br.com.sistema_ecommerce.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/{categoria}")
    public ResponseEntity<?> incluir(@PathVariable String categoria, @RequestBody ProdutoDTO requestDTO) {
        produtoService.incluir(categoria, requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarPorId(@PathVariable Long id, @RequestBody ProdutoDTO requestDTO) {
        var produtoAtualizado = produtoService.atualizarPorId(id, requestDTO);
        return ResponseEntity.status(HttpStatus.OK).body(produtoAtualizado);
    }

    @DeleteMapping("/{id}}")
    public ResponseEntity<?> removerPorId(@PathVariable Long id) {
        produtoService.removerPorId(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/{categoria}")
    public ResponseEntity<?> listarTodosPorCategoria(@PathVariable String categoria) {
        var produtos = produtoService.listarTodosPorCategoria(categoria);
        return ResponseEntity.status(HttpStatus.OK).body(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id) {
        var produto = produtoService.buscarPorId(id);
        return ResponseEntity.ok().build();
    }
}
