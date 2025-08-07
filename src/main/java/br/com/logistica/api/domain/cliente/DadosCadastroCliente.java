package br.com.logistica.api.domain.cliente;

import br.com.logistica.api.domain.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCliente(
        @NotNull(message = "Tipo do cliente é obrigatório")
        TipoCliente tipoCliente,
        String cnpj,
        String cpf,
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