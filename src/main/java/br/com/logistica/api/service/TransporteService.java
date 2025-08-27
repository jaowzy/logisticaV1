package br.com.logistica.api.service;

import br.com.logistica.api.domain.transporte.DadosCadastroTransporte;
import br.com.logistica.api.domain.transporte.Transporte;
import br.com.logistica.api.domain.transporte.TransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransporteService {

    @Autowired
    private TransporteRepository repository;

    public Transporte cadastrar(DadosCadastroTransporte dto){
        var transporte = new Transporte(dto);
        return repository.save(transporte);
    }
}
