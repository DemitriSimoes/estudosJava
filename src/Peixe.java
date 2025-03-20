public class Peixe extends Animal{
    // atributos
    protected String corEscama;

    // setter e getter

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    // metodo comum
    public void soltarBolha(){

    }

    // metodo construtor
    public Peixe(){

    }

    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ectoplasma!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sem som");
    }
}
