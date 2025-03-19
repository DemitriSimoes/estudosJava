import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ContaBancaria novaConta = new ContaBancaria();
        novaConta.abrirConta("Jose", "CC");
        novaConta.depositar(50.50);
        novaConta.sacar(88);
        novaConta.pagarMensal();
        novaConta.fecharConta();
        System.out.println("Número da conta: "+novaConta.getNumConta());
        System.out.println("Dono da conta: "+novaConta.getDono());
        novaConta.abrirConta("JJ", "CP");
        novaConta.sacar(0.5);
        novaConta.fecharConta();
        novaConta.abrirConta("Silva", "CP");
        System.out.println("Número da conta: "+novaConta.getNumConta());
        System.out.println("Dono da conta: "+novaConta.getDono());
        System.out.println("--------------------");
        // Interface:
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();
        c.desligar();
        c.pause();
        c.ligar();
        c.play();
        c.maisVolume();
        c.pause();
        System.out.println("-------------------");
        // Relacionamento entre Classes
        Lutador[] l = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);
        l[0].apresentar();
        l[1].status();
        l[3].status();
        l[4].status();
        Luta uec01 = new Luta();
        uec01.marcarLuta(l[4], l[4]);
        uec01.marcarLuta(l[1], l[5]);
        uec01.lutar();
        uec01.marcarLuta(l[2], l[3]);
        uec01.lutar();
        System.out.println("-------------------");
        // Herança
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno1 = new Aluno("Ze", 50, "M", 1, "Programação");
        alunos.add(aluno1);
        Aluno aluno2 = new Aluno("Sil", 40, "F", 2, "Matemática");
        alunos.add(aluno2);
        System.out.println(alunos.getFirst().getNome());
        System.out.println(aluno1.toString());

        ArrayList<Professor> professores = new ArrayList<>();
        Professor professor1 = new Professor("Guanaba", 30, "M", "Programação", 2500.50);
        professores.add(professor1);
        Professor professor2 = new Professor("G.Gua", 55, "M", "Matemática", 2250.50);
        professores.add(professor2);
        System.out.println(professor1.toString());

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Funcionario funcionario1 = new Funcionario("Silva", 38, "F", "Secretaria", true);
        funcionarios.add(funcionario1);
        Funcionario funcionario2 = new Funcionario("Manoel", 65, "M", "Estoque", true);
        System.out.println(funcionario1.toString());
    }
}