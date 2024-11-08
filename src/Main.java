public class Main {
    public static void main(String[] args) {
        
        Banco bb = new Banco("Banco do Brasil");
        Cliente yas = new Cliente("Yasmim", "123456", new ContaCorrente());

        bb.addCliente(yas);
        yas.getConta().depositar(100);
        
        Cliente diogo = new Cliente("Diogo", "123123", new ContaCorrente());
        bb.addCliente(diogo);

        yas.getConta().transferir(25, diogo.getConta());

        bb.imprimirClientes();

    }
}
