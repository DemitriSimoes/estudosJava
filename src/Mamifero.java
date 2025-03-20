public class Mamifero extends Animal{
    // atributo
    private String corPelo;

    // método getter e setter
    public String getCorPelo(){
        return corPelo;
    }
    public void setCorPelo(String corPelo){
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som do mamífero!");
    }
}
