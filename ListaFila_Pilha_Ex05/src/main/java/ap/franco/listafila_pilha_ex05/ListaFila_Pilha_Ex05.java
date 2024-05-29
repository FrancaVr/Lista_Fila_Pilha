/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ap.franco.listafila_pilha_ex05;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author deida
 */
public class ListaFila_Pilha_Ex05 {

    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        Scanner s = new Scanner(System.in);

        // Adicionando alguns produtos manualmente
        Produto p1 = new Produto("001", "Teste 1", new Date(), "PR", "RS");
        Produto p2 = new Produto("002", "Teste 2", new Date(), "PR", "RS");
        Produto p3 = new Produto("003", "Teste 3", new Date(), "PR", "RS");

        deposito.adicionarCaixa(0, p1);
        deposito.adicionarCaixa(1, p2);
        deposito.adicionarCaixa(2, p3);

        while (true) {
            System.out.println("Escolha uma operação: 1-Adicionar Caixa, 2-Retirar Caixa, 3-Sair");
            int operacao = s.nextInt();

            if (operacao == 3) {
                break;
            }

            System.out.println("Escolha a pilha (0 a 4):");
            int indicePilha = s.nextInt();

            if (operacao == 1) {
                // Adicionando caixa
                System.out.println("Digite o código do produto:");
                String codProduto = s.next();
                System.out.println("Digite a descrição do produto:");
                String descricao = s.next();
                System.out.println("Digite a UF de origem:");
                String ufOrigem = s.next();
                System.out.println("Digite a UF de destino:");
                String ufDestino = s.next();
                Produto novoProduto = new Produto(codProduto, descricao, new Date(), ufOrigem, ufDestino);
                deposito.adicionarCaixa(indicePilha, novoProduto);
            } else if (operacao == 2) {
                // Retirando caixa
                deposito.retirarCaixa(indicePilha);
            } else {
                System.out.println("Operação inválida.");
            }
        }

        s.close();
    }
}
