
package ap.franco.listafila_pilha_ex05;

import java.util.ArrayList;
import java.util.Date;
import java.util.Stack;
import java.util.Scanner;

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

    @Override
    public String toString() {
        return "Produto{" + "codProduto=" + codProduto + ", descricao=" + descricao + ", dataEntrada=" + dataEntrada + ", ufOrigem=" + ufOrigem + ", ufDestino=" + ufDestino + '}';
    }
    
    
}
