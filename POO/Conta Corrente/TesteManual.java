public class TesteManual {
    public static void main (String args[]){
        Cliente c1 = new Cliente();
        c1.clienteEspecial("Walter", "Rua 1");
        Cliente c2 = new Cliente();
        c2.clienteComum("Davi", "Rua 2");

        c1.depositar(100);
        c1.imprimir();
        c1.retirar(50);
        c1.imprimir();
        c1.transferir(c2, 100);
        c1.imprimir();
        c2.imprimir();
        c2.retirar(200);
    }
}
