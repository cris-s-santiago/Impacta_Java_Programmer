package cap10.apostila;

public class Geladeira implements Eletromestico{

    private int temperatura;

    @Override
    public void ligar() {
        System.out.println("ligando a geladeira");

    }

    @Override
    public void desligar() {
        System.out.println("Desligando a geladeira");
    }

    public void descongelar(){
        System.out.println("Descongelando a geladeira");
    }
}
