package cap10.calc;

public interface Subtracao {

    int subtracao(long valor1, long valor2);

    default int subtracao(int valor1, int valor2) {
        return valor1 - valor2;
    }
}
