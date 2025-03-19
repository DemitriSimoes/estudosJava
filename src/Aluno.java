public class Aluno extends Pessoa {
    // atributos
    private int matr;
    private String curso;

    // método getter e setter
    public int getMatr() {
        return matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // método comum
    public void cancelarMatr(){
        System.out.println("Matrículo será cancelada.");
    }

    // método construtor
    public Aluno(String no, int id, String sx, int ma, String cur){
        super(no, id, sx);
        setMatr(ma);
        setCurso(cur);
    }
}
