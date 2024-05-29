
package ap.franco.listafila_pilha_ex02;

import java.util.Scanner;

public class ListaFila_Pilha_Ex02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        FilaBanco fila = new FilaBanco();
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Chamar cliente");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = s.nextInt();
            s.nextLine(); // Consumir a nova linha
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = s.nextLine();
                    System.out.print("Digite o ano de nascimento do cliente: ");
                    int anoNascimento = s.nextInt();
                    fila.adicionarCliente(nome, anoNascimento);
                    break;
                case 2:
                    fila.chamarCliente();
                    break;
                case 3:
                    System.out.println("Saindo do sistema.");
                    s.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
