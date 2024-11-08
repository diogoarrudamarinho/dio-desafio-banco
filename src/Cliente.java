public class Cliente {
    
    private String nome;
    private String cpf;
    private Conta conta;

    public Cliente(String nome, String cpf, ContaCorrente conta){
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public Cliente(String nome,  String cpf, ContaPoupanca conta){
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Conta getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return ("Nome: " + nome + 
                "\nCPF: " + cpf + 
                conta.toString());
    }
}
