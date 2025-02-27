package br.com.sistema_ecommerce.config;

import br.com.sistema_ecommerce.config.exception.BadRequestException;
import br.com.sistema_ecommerce.config.exception.NotFoundException;
import br.com.sistema_ecommerce.config.exception.RegrasDeNegocioException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handlePagamentoNaoEncontrado(NotFoundException ex) {
        return buildErrorResponse(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Object> handleMetodoPagamentoInvalido(BadRequestException ex) {
        return buildErrorResponse(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RegrasDeNegocioException.class)
    public ResponseEntity<Object> handleRegrasDeNegocioException(RegrasDeNegocioException ex) {
        return buildErrorResponse(ex.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGenericException(Exception ex) {
        return buildErrorResponse("Erro interno no servidor: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<Object> buildErrorResponse(String mensagem, HttpStatus status) {
        Map<String, Object> body = new HashMap<>();
        body.put("erro", mensagem);
        body.put("status", status.value());
        return new ResponseEntity<>(body, status);
    }
}
