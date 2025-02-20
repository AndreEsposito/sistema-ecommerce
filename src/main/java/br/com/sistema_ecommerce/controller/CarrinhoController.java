package br.com.sistema_ecommerce.controller;

import br.com.sistema_ecommerce.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    @GetMapping("/{carrinhoId}")
    public ResponseEntity<?> obterCarrinho(@PathVariable Long carrinhoId) {
        var produtos = carrinhoService.obterCarrinho(carrinhoId);
        return ResponseEntity.status(HttpStatus.OK).body(produtos);
    }

    @PostMapping("/{carrinhoId}/produto/{produtoId}")
    public ResponseEntity<?> adicionarProduto(@PathVariable Long carrinhoId, @PathVariable Long produtoId) {
        carrinhoService.adicionarProduto(carrinhoId, produtoId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/{carrinhoId}/produto/{produtoId}")
    public ResponseEntity<?> removerProduto(@PathVariable Long carrinhoId, @PathVariable Long produtoId) {
        carrinhoService.removerProduto(carrinhoId, produtoId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/{carrinhoId}/preco-total")
    public ResponseEntity<?> calcularTotal(@PathVariable Long carrinhoId) {
        var calculoTotal = carrinhoService.calcularTotal(carrinhoId);
        return ResponseEntity.status(HttpStatus.OK).body(calculoTotal);
    }

}
