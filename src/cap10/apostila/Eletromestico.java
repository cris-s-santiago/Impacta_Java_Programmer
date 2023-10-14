package cap10.apostila;

public interface Eletromestico {

    int voltagem = 110;

    void ligar();

    void desligar();

    static void ligar(Eletromestico... lista) {
        for (Eletromestico item : lista) {
            item.ligar();
            imprimir();
        }
    }
    private static void imprimir() {
        System.out.println("Metodo privado da interface");
    }
}
