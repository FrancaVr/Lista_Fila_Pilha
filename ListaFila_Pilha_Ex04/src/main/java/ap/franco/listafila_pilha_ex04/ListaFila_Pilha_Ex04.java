/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ap.franco.listafila_pilha_ex04;

import java.util.Date;

/**
 *
 * @author deida
 */
public class ListaFila_Pilha_Ex04 {

    public static void main(String[] args) {
       Deposito deposito = new Deposito();


        Produto p1 = new Produto("004", "Teste 01", new Date(), "PR", "RJ");
        Produto p2 = new Produto("008", "Teste 08", new Date(), "PR", "RS");
        Produto p3 = new Produto("009", "Produto Teste 09", new Date(), "PR", "RS");


        deposito.adicionarCaixa(p1);
        deposito.adicionarCaixa(p2);
        deposito.adicionarCaixa(p3);


        deposito.retirarCaixa();
        deposito.retirarCaixa();
    }
}