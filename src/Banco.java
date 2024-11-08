import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;
    private List<Cliente> clientes;

    public Banco(String nome){
        this.nome = nome;
        clientes = new ArrayList<>();
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void removerCliente(String cpf){

        for (Cliente cliente : clientes)
            if (cliente.getCpf().equals(cpf)) 
                clientes.remove(cliente);  
    }

    public void imprimirClientes(){
        
        for (Cliente cliente : clientes)
            System.out.println(cliente.toString());
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

}
