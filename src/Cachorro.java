public class Cachorro extends Lobo{

    @Override
    public void emitirSom() {
        System.out.println("Au, Au!");
    }
    // metodos de sobrecarga
    public void reagir(String fala){
        if (fala.equals("toma comida") || fala.equals("Olá")){
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnarrrr!!!");
        }
    }

    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanar");
        } else if (hora >= 18){
            System.out.println("Ignorado");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnarrrrrr");
        }
    }

    public void reagir(int idade, double peso){
        if (idade <= 5 && peso < 10){
            System.out.println("Abanar e latir");
        } else if (idade > 5 && peso < 30){
            System.out.println("Latir");
        } else {
            System.out.println("Ignorar");
        }
    }
}
