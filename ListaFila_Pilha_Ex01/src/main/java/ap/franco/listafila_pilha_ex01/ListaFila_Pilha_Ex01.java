package ap.franco.listafila_pilha_ex01;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ListaFila_Pilha_Ex01 {
    private static Deque<String> fila = new LinkedList<>();
    private static final int senhas = 20; // Limite de senhas por dia

    public static void main(String[] args) {
        int opcao;
        do {
            Menu();
            opcao = opcoes();
            switch (opcao) {
                case 1:
                    addPaciente();
                    break;
                case 2:
                    chamarProx();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void Menu() {
        System.out.println("\n\nSistema de Fila de Pacientes");
        System.out.println("--------------------------");
        System.out.println("1 - Adicionar paciente");
        System.out.println("2 - Chamar próximo paciente");
        System.out.println("0 - Sair");
        System.out.print("Digite a opção desejada: ");
    }

    private static int opcoes() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Opção inválida! Digite um número:");
            scanner.next(); // Descarta a entrada inválida
        }
        return scanner.nextInt();
    }

    private static void addPaciente() {
        if (fila.size() < senhas) {
            System.out.print("Digite o nome do paciente: ");
            Scanner scanner = new Scanner(System.in);
            String nomePaciente = scanner.nextLine();
            fila.addLast(nomePaciente); // Adiciona o paciente ao final da fila.
            System.out.println("Paciente " + nomePaciente + " adicionado à fila!");
        } else {
            System.out.println("Limite de senhas por dia atingido!");
        }
    }

    private static void chamarProx() {
        if (!fila.isEmpty()) {
            String nomePaciente = fila.pollFirst(); // Remove o primeiro paciente da fila.
            System.out.println("Próximo paciente: " + nomePaciente);
        } else {
            System.out.println("Fila de pacientes vazia!");
        }
    }
}
