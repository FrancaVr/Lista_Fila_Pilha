
package ap.franco.listafila_pilha_ex03;

import java.util.Stack;

public class PilhaLivros {
    private Stack<String> pilha;

    public PilhaLivros() {
        pilha = new Stack<>();
    }

    public void adicionarLivro(String livro) {
        pilha.push(livro);
        System.out.println("O livro \"" + livro + "\" foi adicionado à pilha.");
    }

    public void listarLivros() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Livros na pilha:");
            for (int i = pilha.size() - 1; i >= 0; i--) {
                System.out.println(pilha.get(i));
            }
        }
    }

    public void retirarLivro() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia. Não há livros para retirar.");
        } else {
            String livro = pilha.pop();
            System.out.println("O livro \"" + livro + "\" foi retirado da pilha.");
        }
    }
}
