import java.util.ArrayList;

public class Banco {
    String nomeBanco;
    ArrayList<Cliente> listaCliente;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        listaCliente = new ArrayList<>();
    }

    public void adicionarConta(Cliente c){
        listaCliente.add(c);
    }

    public Cliente buscarConta(String nome){
        for(Cliente c : listaCliente){
            if(c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }
}
