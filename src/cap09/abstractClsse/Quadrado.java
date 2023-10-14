package cap09.abstractClsse;

public class Quadrado extends Poligono {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double result = lado * lado;
        System.out.println("Area do quadrado: " + result);
        return result;
    }
}
