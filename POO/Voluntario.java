public class Voluntario extends Participante {
    private String atividade;

    public Voluntario(String nome, String email, Evento evento) {
        super(nome, email, evento);
        this.atividade = "auxiliar na organização do evento";
    }

    public String getAtividade(){
        return this.atividade;
    }
    @Override
    public String getCertificado () {
        return "Declaramos que " + getNome() + "se voluntariou no evento: " + getEvento().getNome() + " como " + atividade;
    }

    @Override
    public String toString(){
        return "Voluntário: " +  getNome();
    }
}
