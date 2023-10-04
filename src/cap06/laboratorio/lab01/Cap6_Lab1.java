package cap06.laboratorio.lab01;

public class Cap6_Lab1 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int somar = calculadora.somar(10, 5);

        int subtrair = calculadora.subtrair(10, 5);

        double multiplicar = calculadora.multiplicar(10, 5);

        double dividir = calculadora.dividir(10, 5);

        calculadora.imprimir("somar", 10, 5, somar);
        calculadora.imprimir("subtrair", 10, 5, subtrair);
        calculadora.imprimir("multiplicar", 10, 5, (int) multiplicar);
        calculadora.imprimir("dividir", 10, 5, (int) dividir);

    }
}
