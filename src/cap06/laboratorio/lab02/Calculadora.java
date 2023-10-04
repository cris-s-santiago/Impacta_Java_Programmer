package cap06.laboratorio.lab02;

public class Calculadora {

    public double subtrair (double valor1, double valor2){
        return valor1 - valor2;
    }
    public double subtrair (int valor1, double valor2){
        return valor1 - valor2;
    }
    public double subtrair (double valor1, int valor2){
        return valor1 - valor2;
    }

    public void imprimir ( int valor1, String tipo, double resultado){
        System.out.println("Chamando a versão de subtrair com "+valor1+" "+tipo+" : "+resultado);
    }
    public void imprimir (String tipo1, String tipo2, double resultado){
        System.out.println("Chamando a versão de subtrair com 1 "+tipo1+" e um "+tipo2+" : "+resultado);
    }
}
