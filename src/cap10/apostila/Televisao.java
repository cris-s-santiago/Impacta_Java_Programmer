package cap10.apostila;

public class Televisao implements Eletromestico {
    @Override
    public void ligar() {
        System.out.println("Ligando a TV");
    }

    @Override
    public void desligar() {
        System.out.println("Ligando a TV");
    }

    public void trocarCanal(){
        System.out.println("Trocando de canal");
    }
}
