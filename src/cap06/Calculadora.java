package cap06;

public class Calculadora {

    public int somar (int valor1, int valor2){

        int resultado;
        resultado = valor1 + valor2;
        return resultado;
    }

    public int somar (int valor1, int valor2, int valor3){

        int resultado;
        resultado = valor1 + valor2 + valor3;
        return resultado;
    }

    public long subtrair (long valor1, long valor2){
        return valor1 - valor2;
    }

    public String concatenar (String texto1, String texto2){
        return texto1 + texto2;
    }


    //6.9. Modificador static

    public static double PI = 3.14;
    public static String nome;

    public static double somar (double valor1, double valor2){
        return valor1 + valor2;
    }
}
