import java.util.Scanner;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco("Banco");

        int opcao;

        do {
            System.out.println("\nDigite o número correspondente à ação:\n");
            System.out.println("1: Depósito\n");
            System.out.println("2: Retirada\n");
            System.out.println("3: Transferência\n");
            System.out.println("4: Emitir saldo\n");
            System.out.println("5: Adicionar conta\n");
            System.out.println("0: Sair\n");
            System.out.println("Opção: \n");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o nome do cliente:");
                    String nome = sc.next();
                    if (banco.buscarConta(nome) == null) {
                        System.out.println("Cliente não encontrado");
                    } else {
                        System.out.println("\nValor do depósito");
                        float valor = sc.nextFloat();
                        banco.buscarConta(nome).depositar(valor);
                    }
                    break;
                case 2:
                    System.out.println("\nDigite o nome do cliente:");
                    String nome1 = sc.next();
                    if (banco.buscarConta(nome1) == null) {
                        System.out.println("Cliente não encontrado");
                    } else {
                        System.out.println("\nValor da retirada");
                        float valor1 = sc.nextFloat();
                        banco.buscarConta(nome1).retirar(valor1);
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o nome do cliente de retirada:");
                    String nomeRet = sc.next();
                    if (banco.buscarConta(nomeRet) == null) {
                        System.out.println("Cliente não encontrado");
                    } else {
                        System.out.println("\nDigite o nome do cliente de recebimento:");
                        String nomeRec = sc.next();
                        if (banco.buscarConta(nomeRec) == null) {
                            System.out.println("Cliente não encontrado");
                        } else {
                            System.out.println("\nValor da transferência:");
                            float valor2 = sc.nextFloat();
                            banco.buscarConta(nomeRet).transferir(banco.buscarConta(nomeRec), valor2);
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nDigite o nome do cliente:");
                    String nome3 = sc.next();
                    if (banco.buscarConta(nome3) == null) {
                        System.out.println("Cliente não encontrado");
                    } else {
                        banco.buscarConta(nome3).imprimir();
                    }
                    break;
                case 5:
                    System.out.println("\nDigite o nome do cliente:");
                    String nomeCliente = sc.next();
                    System.out.println("\nDigite o endereço do cliente:");
                    String endereco = sc.next();
                    Cliente c = new Cliente();
                    int especial;
                    do {
                        System.out.println("\nO cliente é especial?");
                        System.out.println("1: Sim");
                        System.out.println("0: Não");
                        especial = sc.nextInt();
                        switch (especial) {
                            case 1:
                                c.clienteEspecial(nomeCliente, endereco);
                                break;
                            case 0:
                                c.clienteComum(nomeCliente, endereco);
                                break;
                            default:
                                System.out.println("Opção Inválida");
                        }
                    } while (especial != 0 && especial != 1);
                    banco.adicionarConta(c);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }
        } while (opcao != 0);

        sc.close();
    }
}
