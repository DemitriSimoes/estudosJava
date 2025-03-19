public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String sexo;

    // método getter setter
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // método comum
    public void fazerAniver(){
        setIdade(getIdade() + 1);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    //método construtor
    public Pessoa(String no, int id, String sx){
        setNome(no);
        setIdade(id);
        setSexo(sx);
    }
}
