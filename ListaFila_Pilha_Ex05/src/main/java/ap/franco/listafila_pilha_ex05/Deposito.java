/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap.franco.listafila_pilha_ex05;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author deida
 */
public class Deposito {
    private ArrayList<Stack<Produto>> pilhas;
    private static final int max = 10;
    private static final int numPilhas = 5;

    public Deposito() {
        pilhas = new ArrayList<>();
        for (int i = 0; i < numPilhas; i++) {
            pilhas.add(new Stack<>());
        }
    }

    public void adicionarCaixa(int indicePilha, Produto produto) {
        if (indicePilha < 0 || indicePilha >= numPilhas) {
            System.out.println("Erro: Índice da pilha inválido.");
            return;
        }

        Stack<Produto> pilha = pilhas.get(indicePilha);
        if (pilha.size() >= max) {
            System.out.println("Erro: A pilha " + indicePilha + " já está cheia. Não é possível adicionar mais caixas.");
        } else {
            pilha.push(produto);
            System.out.println("Caixa adicionada na pilha " + indicePilha + ": " + produto);
            exibirPilhas();
        }
    }

    public void retirarCaixa(int indicePilha) {
        if (indicePilha < 0 || indicePilha >= numPilhas) {
            System.out.println("Erro: Índice da pilha inválido.");
            return;
        }

        Stack<Produto> pilha = pilhas.get(indicePilha);
        if (pilha.isEmpty()) {
            System.out.println("Erro: A pilha " + indicePilha + " está vazia. Não há caixas para retirar.");
        } else {
            Produto produto = pilha.pop();
            System.out.println("Caixa retirada da pilha " + indicePilha + ": " + produto);
            exibirPilhas();
        }
    }

    public void exibirPilhas() {
        for (int i = 0; i < numPilhas; i++) {
            Stack<Produto> pilha = pilhas.get(i);
            System.out.println("Estado atual da pilha " + i + ":");
            if (pilha.isEmpty()) {
                System.out.println("A pilha está vazia.");
            } else {
                for (Produto produto : pilha) {
                    System.out.println(produto);
                }
            }
            System.out.println();
        }
    }
}
