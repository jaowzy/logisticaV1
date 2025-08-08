package br.com.logistica.api.domain.cliente;

import br.com.logistica.api.domain.endereco.DadosEndereco;
import br.com.logistica.api.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "clientes")
@Entity(name = "Cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_cliente", nullable = false)
    private TipoCliente tipoCliente; // B2B ou B2C

    private String cnpj;

    private String cpf;

    private String idERP;

    private String nome;

    private String email;

    private String telefone;

    @Embedded
    private Endereco endereco;

    public Cliente(DadosCadastroCliente dados){
        this.tipoCliente = dados.tipoCliente();
        this.cnpj = dados.cnpj();
        this.cpf = dados.cpf();
        this.idERP = dados.idERP();
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }
}
