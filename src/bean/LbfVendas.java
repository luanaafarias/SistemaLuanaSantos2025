package bean;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="lbf_vendas", catalog="db_luana_santos")
public class LbfVendas implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name="lbf_id_vendas", unique=true, nullable=false)
    private int lbfIdVendas;

    @Column(name="lbf_id_cliente_lbf", nullable=false)
    private int lbfIdClienteLbf;

    @Column(name="lbf_id_funcionario_lbf", nullable=false)
    private int lbfIdFuncionarioLbf;

    @Temporal(TemporalType.DATE)
    @Column(name="lbf_dataVenda", nullable=false)
    private Date lbfDataVenda;

    @Column(name="lbf_total", nullable=false, precision=10)
    private double lbfTotal;

    // Relacionamento correto: UMA VENDA TEM VÁRIOS PRODUTOS
    @OneToMany(mappedBy = "lbfVendas", fetch = FetchType.LAZY)
    private List<LbfVendasProdutos> itens;

    public LbfVendas() {}

    // Getters e Setters
    public int getLbfIdVendas() {
        return lbfIdVendas;
    }

    public void setLbfIdVendas(int lbfIdVendas) {
        this.lbfIdVendas = lbfIdVendas;
    }

    public int getLbfIdClienteLbf() {
        return lbfIdClienteLbf;
    }

    public void setLbfIdClienteLbf(int lbfIdClienteLbf) {
        this.lbfIdClienteLbf = lbfIdClienteLbf;
    }

    public int getLbfIdFuncionarioLbf() {
        return lbfIdFuncionarioLbf;
    }

    public void setLbfIdFuncionarioLbf(int lbfIdFuncionarioLbf) {
        this.lbfIdFuncionarioLbf = lbfIdFuncionarioLbf;
    }

    public Date getLbfDataVenda() {
        return lbfDataVenda;
    }

    public void setLbfDataVenda(Date lbfDataVenda) {
        this.lbfDataVenda = lbfDataVenda;
    }

    public double getLbfTotal() {
        return lbfTotal;
    }

    public void setLbfTotal(double lbfTotal) {
        this.lbfTotal = lbfTotal;
    }

    public List<LbfVendasProdutos> getItens() {
        return itens;
    }

    public void setItens(List<LbfVendasProdutos> itens) {
        this.itens = itens;
    }
}
