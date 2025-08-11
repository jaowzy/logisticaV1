package br.com.logistica.api.domain.transporte;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "transportes")
@Entity(name = "Transporte")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pedidoTransporte;
    private Transportador transportadora;
    private String codigoRastreio;
    private String dataInt;
    private String dataExp;
    private String previsaoRastreio;
//    private Endereco endereco;
    private StatusTransportadora statusTransportadora;
    private StatusEntrega statusEntrega;
    private ValidacaoTransportadora validacaoTransportadora;
    private String notaFiscal;
    private BigDecimal pesoKg;
    private String volumeCaixa;
    private String uniPecas;

    public Transporte(DadosCadastroTransporte dados){
        this.pedidoTransporte = dados.pedidoTransporte();
        this.transportadora = dados.transportadora();
        this.codigoRastreio = dados.codigoRastreio();
        this.dataInt = dados.dataInt();
        this.dataExp = dados.dataExp();
        this.previsaoRastreio = dados.previsaoRastreio();
        this.statusTransportadora = dados.statusTransportadora();
        this.statusEntrega = dados.statusEntrega();
        this.validacaoTransportadora = dados.validacaoTransportadora();
        this.notaFiscal = dados.notaFiscal();
        this.pesoKg = dados.pesoKg();
        this.volumeCaixa = dados.volumeCaixa();
        this.uniPecas = dados.uniPecas();
    }
}