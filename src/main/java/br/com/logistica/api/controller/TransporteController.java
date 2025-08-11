package br.com.logistica.api.controller;

import br.com.logistica.api.domain.transporte.DadosCadastroTransporte;
import br.com.logistica.api.domain.transporte.Transporte;
import br.com.logistica.api.domain.transporte.TransporteRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("transporte")
public class TransporteController {

    @Autowired
    private TransporteRepository transporteRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<Void> cadastrar(@RequestBody @Valid DadosCadastroTransporte dados, UriComponentsBuilder uriBuilder){
        var transporte = new Transporte(dados);
        transporteRepository.save(transporte);
        var uri = uriBuilder.path("/transporte/{id}").buildAndExpand(transporte.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
