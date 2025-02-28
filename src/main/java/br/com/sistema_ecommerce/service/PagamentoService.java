package br.com.sistema_ecommerce.service;

import br.com.sistema_ecommerce.config.exception.NotFoundException;
import br.com.sistema_ecommerce.controller.dto.PagamentoDTO;
import br.com.sistema_ecommerce.factory.PagamentoFactory;
import br.com.sistema_ecommerce.mapper.PagamentoMapper;
import br.com.sistema_ecommerce.repository.PagamentoRepository;
import br.com.sistema_ecommerce.repository.entity.PagamentoEntity;
import br.com.sistema_ecommerce.strategy.PagamentoStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PagamentoService {
    private final PagamentoRepository repository;
    private final PagamentoMapper mapper;

    public PagamentoDTO processarPagamento(PagamentoDTO request) {
        PagamentoStrategy fluxoPagamento = PagamentoFactory.criarPagamento(request.getMetodo());
        request.setStatus(fluxoPagamento.processarPagamento(request.getValor()));

        PagamentoEntity entity = mapper.toEntity(request);
        repository.save(entity);

        return mapper.toDTO(entity);
    }

    public PagamentoDTO consultarPagamento(Long id) {
        PagamentoEntity entity = repository.findById(id).orElseThrow(() -> new NotFoundException("Pagamento não encontrado"));
        return mapper.toDTO(entity);
    }
}
