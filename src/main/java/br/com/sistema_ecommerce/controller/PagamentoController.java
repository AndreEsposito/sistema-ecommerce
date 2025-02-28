package br.com.sistema_ecommerce.controller;

import br.com.sistema_ecommerce.controller.dto.PagamentoDTO;
import br.com.sistema_ecommerce.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping
    public ResponseEntity<?> realizarPagamento(@RequestBody PagamentoDTO request) {
        var response = pagamentoService.processarPagamento(request);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> consultarPagamento(@PathVariable Long id) {
        var response = pagamentoService.consultarPagamento(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
