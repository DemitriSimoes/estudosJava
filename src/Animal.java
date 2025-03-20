public abstract class Animal {
    // atributos
    protected double peso;
    protected int idade;
    protected int membros;

    // método getter e setter
    public double getPeso() {
        return peso;
    }
    public int getIdade() {
        return idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }

    // método comum
    public void locomover(){
    }
    public void alimentar(){
    }
    public void emitirSom(){
    }

    // método construtor
    public Animal(){

    }
}
