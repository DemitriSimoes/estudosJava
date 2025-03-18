import java.sql.SQLOutput;
import java.util.Random;

public class Luta implements LutaControler{
   // todo atributos:
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    // método getters e setters:
    public Lutador getDesafiado(){
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante(){
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante){
        this.desafiante = desafiante;
    }
    public int getRounds(){
        return rounds;
    }
    public void setRounds(int rounds){
        this.rounds = rounds;
    }
    public boolean getAprovada(){
        return aprovada;
    }
    public void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }
    // método Construtor:
    public Luta(){
        System.out.println("Nova luta criada com sucesso.");
    }
    // método implementar interface:
    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            setDesafiado(l1);
            setDesafiante(l2);
            setAprovada(true);
            System.out.println("Luta marcada com sucesso entre.");
            System.out.println("*****");
            getDesafiante().status();
            getDesafiado().status();
        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
            System.out.println("Não foi possível marcar Luta, favor verificar os Lutadores.");
        }
    }
    @Override
    public void lutar() {
        if (getAprovada() == true){
            System.out.println("*Desafiado*");
            getDesafiado().apresentar();
            System.out.println("*Desafiante*");
            getDesafiante().apresentar();
            //vencedor = aleatório(0,1,2)
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            //escolha (vencedor)
            switch (vencedor){
                case 0:// caso 0: empate
                    System.out.println("Empatou");
                    getDesafiante().empatarLuta();
                    getDesafiado().empatarLuta();
                    System.out.println(getDesafiante().getNome()+ " ficou com "+getDesafiante().getEmpates()+" empates.");
                    System.out.println(getDesafiado().getNome()+" ficou com "+getDesafiado().getEmpates()+" empates.");
                    break;
                case 1:// caso 1: vitória desafiado
                    System.out.println("* "+getDesafiado().getNome()+" venceu!!!");
                    getDesafiado().ganharLuta();
                    getDesafiante().perderLuta();
                    System.out.println(getDesafiado().getNome()+" ficou com "+getDesafiado().getVitorias()+" vitórias.");
                    System.out.println(getDesafiante().getNome()+" ficou com "+getDesafiante().getDerrotas()+" derrotas.");
                    break;
                case 2:// caso 2: vitória desafiante
                    System.out.println("* "+getDesafiante().getNome()+" venceu!!!");
                    getDesafiante().ganharLuta();
                    getDesafiado().perderLuta();
                    System.out.println(getDesafiante().getNome()+" ficou com "+getDesafiante().getVitorias()+" vitórias");
                    System.out.println(getDesafiado().getNome()+" ficou com "+getDesafiado().getDerrotas()+" derrotas.");
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer.");
        }
    }
}
