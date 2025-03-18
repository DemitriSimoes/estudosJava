import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class ControleRemoto implements Controlador {
// todo atributos:
    private int volume;
    private boolean ligado;
    private boolean tocando;

// método getters e setters:
    private int getVolume(){
        return volume;
    }
    private boolean getLigado(){
        return ligado;
    }
    private boolean getTocando(){
        return tocando;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

// método Construtor:
    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

// método da Interface:
    @Override
    public void ligar(){
        setLigado(true);
    }
    @Override
    public void desligar(){
        setLigado(false);
    }
    @Override
    public void abrirMenu(){
        if (getLigado() == true){
            System.out.println("\n----MENU----");
            System.out.println("Está ligado? "+getLigado());
            System.out.println("Está tocando? "+getTocando());
            System.out.print("Volume: "+getVolume()+" ");
            for (int i = 0; i <= getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.print("\n");
        } else {
            System.out.println("Desligado");
        }

    }
    @Override
    public void fecharMenu(){
        if (getLigado() == true) {
            System.out.println("Fechando Menu...");
        } else {
            System.out.println("Desligado");
        }
    }
    @Override
    public void maisVolume(){
        if (getLigado() == true){
            setVolume(getVolume()+10);
            System.out.print("Volume "+getVolume()+" ");
            for (int i = 0; i < getVolume(); i +=10){
                System.out.print("|");
            }
            System.out.println(" ");
        } else {
            System.out.println("Desligado");
        }
    }
    @Override
    public void menosVolume(){
        if (getLigado() == true){
            setVolume(getVolume()-10);
        } else {
            System.out.println("Desligado");
        }
    }
    @Override
    public void ligarMudo(){
        if (getLigado() == true && getVolume() > 0){
            setVolume(0);
            System.out.println("Volume "+getVolume());
        } else {
            System.out.println("Desligado");
        }
    }
    @Override
    public void desligarMudo(){
        if (getLigado() == true && getVolume() == 0){
            setVolume(50);
        } else {
            System.out.println("Desligado");
        }
    }
    @Override
    public void play(){
        if (getLigado() == true && getTocando() == false){
            setTocando(true);
            System.out.println("Tocando...");
        } else {
            System.out.println("Desligado");
        }
    }
    @Override
    public void pause(){
        if (getLigado()==true && getTocando() == true){
            setTocando(false);
            System.out.println("Pause...");
        } else {
            System.out.println("Desligado");
        }
    }
}
