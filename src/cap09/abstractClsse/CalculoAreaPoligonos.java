package cap09.abstractClsse;

public class CalculoAreaPoligonos {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(10);
        quadrado.calcularArea();

        Triangulo triangulo = new Triangulo(15, 20);
        triangulo.calcularArea();
    }
}
