package br.com.logistica.api.domain.transporte;

import br.com.logistica.api.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "trasportes")
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
    private String pesoKG;
    private String volumeCaixa;
    private String uniPecas;

    public void cadastroTransporte(DadosCadastroTransporte dados){
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
        this.pesoKG = dados.pesoKG();
        this.volumeCaixa = dados.volumeCaixa();
        this.uniPecas = dados.uniPecas();
    }
}
