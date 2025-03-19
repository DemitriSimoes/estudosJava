public class Funcionario extends Pessoa{
    // atributos
    private String setor;
    private boolean trabalhando;

    // método getter e setter

    public String getSetor() {
        return setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    // método comum
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;

    }

    // método construtor
    public Funcionario(String no, int id, String sx, String se, Boolean tr){
        super(no, id, sx);
        setSetor(se);
        setTrabalhando(tr);
    }
}
