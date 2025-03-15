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
        numConta = 0;
        status = false;
    }
    public void abrirConta(String nome, String conta) {
        tipo = conta;
        dono = nome;
        status = true;
        if (numConta == 0) {
            numConta += 1;
        } else {
            numConta++;
        }
        if (tipo.equals("CC")) {
            saldo = 50.00;
            System.out.println("Você recebeu: " + saldo);
        } else if (tipo.equals("CP")) {
            saldo = 150.00;
            System.out.println("Você recebeu: " + saldo);
        }
    }
    public void fecharConta() {
        if (saldo == 0){
            System.out.println("Sua conta foi fechada");
            status = false;
        } else if (saldo < 0){
            System.out.println("Sua conta não pode ser fechada, pois está com saldo devedor");
        } else {
            System.out.println("Sua conta não pode ser fechada, favor sacar o saldo restante");
        }
    }
    public void depositar(double valor){
        if (status == true){
            saldo += valor;
            System.out.println("Seu saldo: "+saldo);
        } else {
            System.out.println("Sua conta não foi aberta");
        }
    };
    public void sacar(double valor){
        if (status == true && saldo > 0){
            saldo -= valor;
            System.out.println("Seu saldo: "+saldo);
        } else {
            System.out.println("Você não tem saldo suficiente");
        }
    }
    public void pagarMensal(){
        if (tipo == "CC" && status == true){
            saldo -= 12.00;
            System.out.println("Seu saldo: "+saldo);
        } else if (tipo == "CP" && status == true){
            saldo -= 20.00;
            System.out.println("Seu saldo: "+saldo);
        } else {
            System.out.println("Não existe conta aberta");
        }
    }
}
