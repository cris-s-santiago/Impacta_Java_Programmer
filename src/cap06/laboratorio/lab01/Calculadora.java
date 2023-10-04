package cap06.laboratorio.lab01;

public class Calculadora {

    public int somar (int valor1, int valor2){
        return valor1 + valor2;
    }

    public int subtrair (int valor1, int valor2){
        return valor1 - valor2;
    }

    public double multiplicar (int valor1, int valor2){
        return valor1 * valor2;
    }

    public double dividir (int valor1, int valor2){
        return (double) valor1 / valor2;
    }

    public void imprimir (String texto, int valor1, int valor2, int resultado){
        System.out.println("Calc."+texto+"("+valor1+","+valor2+") = "+resultado);
    }
}
