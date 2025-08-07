package br.com.logistica.api.controller;

import br.com.logistica.api.domain.cliente.Cliente;
import br.com.logistica.api.domain.cliente.ClienteRepository;
import br.com.logistica.api.domain.cliente.DadosCadastroCliente;
import br.com.logistica.api.service.ClienteService;
import br.com.logistica.api.validacao.ClienteValidador;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid Cliente cliente){
        if(ClienteValidador.validarCliente(cliente)){
            repository.save(cliente);
        }
    }
}