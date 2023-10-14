package cap10.calc;

public interface Divisao {

    int dividir(long valor1, long valor2);

    default int dividir(int valor1, int valor2) {
        return valor1 / valor2;
    }
}
