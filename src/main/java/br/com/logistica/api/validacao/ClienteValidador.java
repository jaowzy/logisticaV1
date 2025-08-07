package br.com.logistica.api.validacao;

import br.com.logistica.api.domain.cliente.Cliente;

public class ClienteValidador {

    public static boolean validarCliente(Cliente cliente){
        if("B2B".equals(cliente.getTipoCliente())){
            return cliente.getCnpj() != null && !cliente.getCnpj().isEmpty();
        } else if("B2C".equals(cliente.getTipoCliente())){
            return cliente.getCpf() != null && !cliente.getCpf().isEmpty();
        }
        return false;
    }
}
