
package ap.franco.listafila_pilha_ex02;


public class Cliente {
    private int senha;
    private String nome;
    private int anoNascimento;

    public Cliente(int senha, String nome, int anoNascimento) {
        this.senha = senha;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
    public int getIdade(){
        return 2024 - anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "senha=" + senha + ", nome=" + nome + ", anoNascimento=" + anoNascimento + '}';
    }
    
    
}
