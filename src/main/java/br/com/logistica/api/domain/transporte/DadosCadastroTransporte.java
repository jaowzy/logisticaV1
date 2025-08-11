package br.com.logistica.api.domain.transporte;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

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

        BigDecimal pesoKg,

        String volumeCaixa,

        String uniPecas
) {
}
