
package ap.franco.listafila_pilha_ex04;

import java.util.Stack;

public class Deposito {
    private Stack<Produto> pilha;
    private int max = 10;

    public Deposito() {
        pilha = new Stack<>();
    }

    public void adicionarCaixa(Produto produto) {
        if (pilha.size() >= max) {
            System.out.println("Erro: A pilha já está cheia. Não é possível adicionar mais caixas.");
        } else {
            pilha.push(produto);
            System.out.println("Caixa adicionada: " + produto);
            exibirPilha();
        }
    }

    public void retirarCaixa() {
        if (pilha.isEmpty()) {
            System.out.println("Erro: A pilha está vazia. Não há caixas para retirar.");
        } else {
            Produto produto = pilha.pop();
            System.out.println("Caixa retirada: " + produto);
            exibirPilha();
        }
    }

    public void exibirPilha() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Estado atual da pilha:");
            for (Produto produto : pilha) {
                System.out.println(produto);
            }
        }
    }
}
