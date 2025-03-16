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
        
    }
    @Override
    public void fecharMenu(){

    }
    @Override
    public void maisVolume(){

    }
    @Override
    public void menosVolume(){

    }
    @Override
    public void ligarMudo(){

    }
    @Override
    public void desligarMudo(){

    }
    @Override
    public void play(){

    }
    @Override
    public void pause(){

    }
}
