public class Organizador extends Participante {
    private String atividade;

    public Organizador(String nome, String email, Evento evento) {
        super(nome, email, evento);
        this.atividade = "organizou o evento";
    }

    public String getAtividade(){
        return this.atividade;
    }
    @Override
    public String getCertificado () {
        return "Declaramos que " + getNome() + atividade + getEvento().getNome();
    }

    @Override
    public String toString(){
        return "Organizador: " +  getNome();
    }
}
