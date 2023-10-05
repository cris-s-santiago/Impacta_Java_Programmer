package cap07.laboratorio.lab01;

public class Cap7_Lab1 {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();
        cadastro.mostrar("1");

        Cadastro cadastro1 = new Cadastro("Cristiane", "Santiago");
        cadastro1.mostrar("com 2 valores");

        Cadastro cadastro2 = new Cadastro("Cristiane", "Santiago", 32);
        cadastro2.mostrar("com 3 valores");
    }
}
