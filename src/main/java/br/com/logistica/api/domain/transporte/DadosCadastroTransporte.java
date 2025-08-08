package br.com.logistica.api.domain.transporte;

import br.com.logistica.api.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTransporte(
        @NotBlank
        String pedidoTransporte,
        @NotNull
        Transportador transportadora,

        String codigoRastreio,

        String dataInt,

        String dataExp,

        String previsaoRastreio,

        StatusTransportadora statusTransportadora,

        StatusEntrega statusEntrega,

        ValidacaoTransportadora validacaoTransportadora,

        @NotBlank
        String notaFiscal,

        String pesoKG,

        String volumeCaixa,

        String uniPecas
) {
}
