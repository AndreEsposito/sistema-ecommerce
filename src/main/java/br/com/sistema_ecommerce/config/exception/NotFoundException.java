package br.com.sistema_ecommerce.config.exception;

public class NotFoundException extends RuntimeException {
        public NotFoundException(String message) {
            super(message);
        }
}
