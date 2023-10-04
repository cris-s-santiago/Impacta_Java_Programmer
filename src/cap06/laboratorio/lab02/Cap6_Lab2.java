package cap06.laboratorio.lab02;

public class Cap6_Lab2 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double subtrair = calculadora.subtrair(10.5, 5.2);
        double subtrair2 = calculadora.subtrair(10.5, 5);
        double subtrair3 = calculadora.subtrair(10, 5.2);

        calculadora.imprimir(2, "double", subtrair);
        calculadora.imprimir("double", "int", subtrair2);
        calculadora.imprimir("int ", "double", subtrair3);
    }

}
