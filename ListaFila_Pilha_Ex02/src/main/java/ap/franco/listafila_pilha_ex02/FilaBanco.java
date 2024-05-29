
package ap.franco.listafila_pilha_ex02;

import java.util.LinkedList;
import java.util.Queue;

public class FilaBanco {
    private Queue<Cliente> filaPrioritaria = new LinkedList<>();
    private Queue<Cliente> filaNormal = new LinkedList<>();
    private int contador = 0;
    private int senha = 1;
    
    public void adicionarCliente(String nome, int anoNascimento) {
        Cliente novoCliente = new Cliente(senha++, nome, anoNascimento);
        if (novoCliente.getIdade() >= 65) {
            filaPrioritaria.add(novoCliente);
        } else {
            filaNormal.add(novoCliente);
        }
    }
    
    public void chamarCliente() {
        if (contador < 2 && !filaPrioritaria.isEmpty()) {
            Cliente cliente = filaPrioritaria.poll();
            System.out.println("Atendendo cliente prioritário: " + cliente);
            contador++;
        } else if (!filaNormal.isEmpty()) {
            Cliente cliente = filaNormal.poll();
            System.out.println("Atendendo cliente normal: " + cliente);
            contador = 0;
        } else if (!filaPrioritaria.isEmpty()) {
            Cliente cliente = filaPrioritaria.poll();
            System.out.println("Atendendo cliente prioritário: " + cliente);
            contador++;
        } else {
            System.out.println("Nenhum cliente na fila para atendimento.");
        }
    }
}
