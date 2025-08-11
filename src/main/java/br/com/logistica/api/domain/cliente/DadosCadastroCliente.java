package br.com.logistica.api.domain.cliente;

import br.com.logistica.api.domain.endereco.DadosEndereco;
import br.com.logistica.api.domain.cliente.validacao.TipoClienteValido;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@TipoClienteValido(message = "Para o tipo de cliente informado, o CPF ou CNPJ é obrigatório.")
public record DadosCadastroCliente(
        @NotNull(message = "Tipo do cliente é obrigatório")
        TipoCliente tipoCliente,
        @Pattern(regexp = "\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}")
        String cnpj,
        @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")
        String cpf,
        @NotBlank(message = "ID do cliente é obrigatório")
        String idERP,
        @NotBlank(message = "Nome é obrigatório")
        String nome,
        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Formato invalido")
        String email,
        @NotBlank(message = "Telefone é obrigatório")
        String telefone,
        @NotNull(message = "Todos os campos são obrigatórios")
        @Valid
        DadosEndereco endereco) {
}