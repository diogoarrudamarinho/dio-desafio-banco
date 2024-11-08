public abstract class Conta implements IConta{
    
    protected static int SEQUENCIA = 1;
    protected static final int PADRAO = 1;
    protected int numero;
    protected int agencia;
    protected double saldo;

    public Conta(){
        agencia = PADRAO;
        numero = SEQUENCIA++;
        saldo = 0;
    }

    @Override
    public void sacar(double valor){
        if (valor == 0) 
            System.out.println("Valor Inválido");
        else if (valor > saldo) 
            System.out.println("Saldo insuficiente");
        else
            saldo -= valor;
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta conta){
        saldo -= valor;
        conta.saldo += valor;
    }

    @Override
    public void extrato() {
        System.out.println("----- EXTRATO -----");
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return ("\nAgencia" + agencia + 
                "\nNumero: " + numero + 
                "\nSaldo: " + saldo);
    }
}
