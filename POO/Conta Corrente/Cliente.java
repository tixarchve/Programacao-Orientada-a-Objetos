import java.util.Vector;

public class Cliente {

    String nomeCliente;
    String endereco;
    float saldo = 0;
    boolean ehEspecial;

    Vector<Transacoes> listaTransacoes;

    public Cliente() {
        listaTransacoes = new Vector<>();
    }

    void clienteEspecial(String nome, String endereco){
        nomeCliente = nome;
        this.endereco = endereco;
        ehEspecial = true;
    }

    void clienteComum(String nome, String endereco){
        nomeCliente = nome;
        this.endereco = endereco;
        ehEspecial = false;
    }

    public void depositar(float valor){
        saldo += valor;
        listaTransacoes.add(new Transacoes("Depósito", valor));
    }

    public boolean retirar(float valor){
        if (ehEspecial) {
            saldo -= valor;
            listaTransacoes.add(new Transacoes("Retirada", valor));
            return true;
        } else {
            if (valor > saldo) {
                System.out.println("\nRetirada impossibilitada");
                return false;
            } else {
                saldo -= valor;
                listaTransacoes.add(new Transacoes("Retirada", valor));
                return true;
            }
        }
    }

    public boolean transferir(Cliente c2, float valor){
        if (this.retirar(valor)) {
            c2.depositar(valor);
            listaTransacoes.add(new Transacoes("Transferência para " + c2.nomeCliente, valor));
            return true;
        } else {
            return false;
        }
    }

    float retornarSaldo(){
        return saldo;
    }

    void imprimir(){
        System.out.println("\nNome: " + nomeCliente);
        System.out.println("Saldo: R$" + retornarSaldo());
        System.out.println("Endereço: " + endereco);
        System.out.println("Histórico:");
        for (Transacoes t : listaTransacoes) {
            t.imprimir();
        }
    }
}