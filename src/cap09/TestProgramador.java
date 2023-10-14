package cap09;

public class TestProgramador {

    public static void main(String[] args) {

        Programador junior = new Programador("Jao", "jao@exemplo.com", 20,"Java", "Linux");
        junior.imprimir();

        Programador junior2 = new Programador("Maria", "maria@exemplo.com", 25,"Java", "Windows");
        junior2.imprimir();
    }
}
