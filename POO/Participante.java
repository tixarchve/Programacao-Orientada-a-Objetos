public class Participante {
    private String nome;

    public Evento getEvento() {
        return evento;
    }
    private Evento evento;

    public Participante (String n, String email, Evento e) {
        nome = n;
        evento = e;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCertificado () {
        return "Declaramos que " + nome + "participou do evento: " + evento.getNome();
    }
}
