public class Professor extends Pessoa{
    //atributos
    private String especialidade;
    private double salario;

    // método getter e setter

    public String getEspecialidade() {
        return especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // método comum
    public void receberAumen(){

    }

    // método construtor
    public Professor(String no, int id, String sx, String es, double sal){
        super(no, id, sx);
        setEspecialidade(es);
        setSalario(sal);

    }
}
