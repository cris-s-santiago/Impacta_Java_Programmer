package cap10.apostila;

public class Microondas implements Eletromestico{
    @Override
    public void ligar() {
        System.out.println("ligando a microondas");
    }

    @Override
    public void desligar() {
        System.out.println("desligando a microondas");
    }

    public void aquecer(){
        System.out.println("Aquecendo no microondas");
    }

    public void assar(){
        System.out.println("Assando no microondas");
    }


}
