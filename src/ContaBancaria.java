public class ContaBancaria {
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    public ContaBancaria (){
        setNumConta(0);
        setStatus(false);
    }
    public void abrirConta(String nome, String conta) {
        setTipo(conta);
        setDono(nome);
        setStatus(true);
        if (getNumConta() == 0) {
            numConta += 1;
        } else {
            numConta++;
        }
        if (tipo.equals("CC")) {
            setSaldo(50);
            System.out.println("Você recebeu: " + getSaldo());
        } else if (tipo.equals("CP")) {
            setSaldo(150);
            System.out.println("Você recebeu: " + getSaldo());
        }
    }
    public void fecharConta() {
        if (getSaldo() == 0){
            System.out.println("Sua conta foi fechada");
            setStatus(false);
        } else if (getSaldo() < 0){
            System.out.println("Sua conta não pode ser fechada, pois está com saldo devedor");
        } else {
            System.out.println("Sua conta não pode ser fechada, favor sacar o saldo restante");
        }
    }
    public void depositar(double valor){
        if (getStatus() == true){
            setSaldo(getSaldo() + valor);
            System.out.println("Seu saldo: "+getSaldo());
        } else {
            System.out.println("Sua conta não foi aberta");
        }
    }
    public void sacar(double valor){
        if (getStatus() == true && getSaldo() > 0 && getSaldo() > valor){
            saldo -= valor;
            System.out.println("Seu saldo: "+getSaldo());
        } else {
            System.out.println("Você não tem saldo suficiente");
        }
    }
    public void pagarMensal(){
        if (getTipo() == "CC" && getStatus() == true && getSaldo() > -20){
            setSaldo(getSaldo() - 12.00);
            System.out.println("Seu saldo: "+getStatus());
        } else if (getTipo() == "CP" && getStatus() == true && getSaldo() > -20){
            setSaldo(getSaldo() - 20.00);
            System.out.println("Seu saldo: "+getSaldo());
        } else {
            System.out.println("Não existe conta aberta");
        }
    }
}
