package cap10.calc;

public interface Multiplicacao {

    int multiplicar(long valor1, long valor2);

    default int multiplicar(int valor1, int valor2) {
        return valor1 * valor2;
    }
}
