
package ap.franco.listafila_pilha_ex04;

import java.util.ArrayList;
import java.util.Date;
import java.util.Stack;

public class Produto {
    private String codProduto;
    private String descricao;
    private Date dataEntrada;
    private String ufOrigem;
    private String ufDestino;

    public Produto(String codProduto, String descricao, Date dataEntrada, String ufOrigem, String ufDestino) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.ufOrigem = ufOrigem;
        this.ufDestino = ufDestino;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getUfOrigem() {
        return ufOrigem;
    }

    public void setUfOrigem(String ufOrigem) {
        this.ufOrigem = ufOrigem;
    }

    public String getUfDestino() {
        return ufDestino;
    }

    public void setUfDestino(String ufDestino) {
        this.ufDestino = ufDestino;
    }

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", descricao=" + descricao + ", dataEntrada=" + dataEntrada + ", ufOrigem=" + ufOrigem + ", ufDestino=" + ufDestino + '}';
    }
    
    
}
