package cap09.abstractClsse;

public class Triangulo extends Poligono {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double result = (base * altura) / 2;
        System.out.println("Area do triangulo: " + result);
        return result;
    }
}
