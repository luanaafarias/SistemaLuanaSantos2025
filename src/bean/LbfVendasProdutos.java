package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="lbf_vendas_produtos", catalog="db_luana_santos")
public class LbfVendasProdutos implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name="lbf_id_vendasProdutos", unique=true, nullable=false)
    private int lbfIdVendasProdutos;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="lbf_id_produto", nullable=false)
    private LbfProdutos lbfProdutos;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="lbf_id_venda", nullable=false)
    private LbfVendas lbfVendas;

    @Column(name="lbf_quantidade", nullable=false)
    private int lbfQuantidade;

    @Column(name="lbf_valor_unitario", nullable=false, precision=10)
    private double lbfValorUnitario;

    public int getLbfIdVendasProdutos() {
        return lbfIdVendasProdutos;
    }

    public void setLbfIdVendasProdutos(int id) {
        this.lbfIdVendasProdutos = id;
    }

    public LbfProdutos getLbfProdutos() {
        return lbfProdutos;
    }

    public void setLbfProdutos(LbfProdutos produtos) {
        this.lbfProdutos = produtos;
    }

    public LbfVendas getLbfVendas() {
        return lbfVendas;
    }

    public void setLbfVendas(LbfVendas vendas) {
        this.lbfVendas = vendas;
    }

    public int getLbfQuantidade() {
        return lbfQuantidade;
    }

    public void setLbfQuantidade(int quantidade) {
        this.lbfQuantidade = quantidade;
    }

    public double getLbfValorUnitario() {
        return lbfValorUnitario;
    }

    public void setLbfValorUnitario(double valorUnitario) {
        this.lbfValorUnitario = valorUnitario;
    }
}
