package br.com.logistica.api.service;

import br.com.logistica.api.domain.cliente.ClienteRepository;
import br.com.logistica.api.domain.cliente.DadosCadastroCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void cadastrar(DadosCadastroCliente dto){
    }
}
