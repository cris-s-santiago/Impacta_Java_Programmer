package cap10.calc;

public interface Soma {

    String valor = "10"; // tem que ser inicializado

    int soma(long valor1, long valor2); //metodo abstrato

    default int soma(int valor1, int valor2) { //metodo implementado tem que ser default
        return valor1 + valor2;
    }
}
