package cap10.calc;

public class Calculadora implements Soma, Divisao, Multiplicacao, Subtracao, Potencia {
    @Override
    public int dividir(long valor1, long valor2) {
        return (int) (valor1 / valor2);
    }

    @Override
    public int multiplicar(long valor1, long valor2) {
        return (int) (valor1 * valor2);
    }

    @Override
    public int soma(long valor1, long valor2) {
        return (int) (valor1 * valor2);
    }

    @Override
    public int subtracao(long valor1, long valor2) {
        return (int) (valor1 - valor2);
    }

    @Override
    public double potenciar(long valor1, long valor2) {
        double resultado = 1;
        for (int i = 0; i < valor2; i++) {
            resultado *= valor1;
        }
        return resultado;
    }
}
