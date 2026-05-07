public class Transacoes {
    String acao;
    float valor;

    public Transacoes(String acao, float valor){
        this.acao = acao;
        this.valor = valor;
    }

    void imprimir(){
        System.out.println(acao + " - R$" + valor);
    }
}

