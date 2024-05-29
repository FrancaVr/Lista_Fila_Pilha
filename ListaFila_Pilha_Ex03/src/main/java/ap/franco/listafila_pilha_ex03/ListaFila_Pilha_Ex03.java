/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ap.franco.listafila_pilha_ex03;

import java.util.Scanner;

/**
 *
 * @author deida
 */
public class ListaFila_Pilha_Ex03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PilhaLivros pilha = new PilhaLivros();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Retirar livro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = s.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome do livro a ser adicionado: ");
                    String livro = s.nextLine();
                    pilha.adicionarLivro(livro);
                    break;
                case "2":
                    pilha.listarLivros();
                    break;
                case "3":
                    pilha.retirarLivro();
                    break;
                case "4":
                    System.out.println("Saindo...");
                    s.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
