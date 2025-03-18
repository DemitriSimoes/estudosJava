public class Lutador implements LutadorControler {
    //todo Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // método getter e setter
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria(categoria);
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        if (getPeso() >= 52.2 && getPeso() < 70.3){
            this.categoria = "Peso Leve";
        } else if (getPeso() >= 70.3 && getPeso() < 83.9){
            this.categoria = "Peso Médio";
        } else if (getPeso() >= 83.9 && getPeso() <= 120.2){
            this.categoria = "Peso Pesado";
        } else {
            System.out.println("Não se enquadra em nenhuma categoria.");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    // método Construtor
    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
        getCategoria();
    }
// implementa interface:
    @Override
    public void apresentar() {
        System.out.println("** Chegou a hora! Apresentamos o Lutador: "+getNome());
        System.out.println("Diretamente de: "+getNacionalidade());
        System.out.print("Com "+getIdade()+ " anos ");
        System.out.println("e "+getAltura()+" m de altura");
        System.out.println("Da Categoria: "+getCategoria());
        System.out.println("com "+getVitorias()+" vitórias");
        System.out.println("com "+getDerrotas()+" derrotas");
        System.out.println("e com "+getEmpates()+" empates");
        System.out.println("*****");
    }
    @Override
    public void status() {
        System.out.println(getNome());
        System.out.println(getCategoria());
        System.out.println("V: "+getVitorias());
        System.out.println("D: "+getDerrotas());
        System.out.println("E: "+getDerrotas());
        System.out.println("*****");
    }
    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
