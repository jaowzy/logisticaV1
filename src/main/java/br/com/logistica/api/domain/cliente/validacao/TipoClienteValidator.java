package br.com.logistica.api.validacao;

import br.com.logistica.api.domain.cliente.DadosCadastroCliente;
import br.com.logistica.api.domain.cliente.TipoCliente;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TipoClienteValidator implements ConstraintValidator<TipoClienteValido, DadosCadastroCliente> {

    @Override
    public boolean isValid(DadosCadastroCliente dados, ConstraintValidatorContext constraintValidatorContext) {
        if(dados.tipoCliente() == null){
            return false;
        }
        if(dados.tipoCliente() == TipoCliente.B2B){
            return dados.cnpj() != null && !dados.cnpj().isBlank();
        }
        if(dados.tipoCliente() == TipoCliente.B2C){
            return dados.cpf() != null && !dados.cpf().isBlank();
        }
        return false;
    }
}
