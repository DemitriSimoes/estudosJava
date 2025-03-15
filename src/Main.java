

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ContaBancaria novaConta = new ContaBancaria();
        novaConta.abrirConta("Jose", "CC");
        novaConta.depositar(50.50);
        novaConta.sacar(90.25);
        novaConta.pagarMensal();
        novaConta.fecharConta();
        System.out.println("Número da conta: "+novaConta.getNumConta());
        System.out.println("Dono da conta: "+novaConta.getDono());
        novaConta.abrirConta("JJ", "CP");
        System.out.println("Número da conta: "+novaConta.getNumConta());
        System.out.println("Dono da conta: "+novaConta.getDono());
    }
}