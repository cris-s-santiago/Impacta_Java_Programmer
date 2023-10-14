package cap09.Polimorfismo;

public class Zoologico {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.comer();

        Zebra z = new Zebra();
        a = z;
        a.comer();

        a = new Leao();
        a.comer();
    }
}
