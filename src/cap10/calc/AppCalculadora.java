package cap10.calc;

public class AppCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double potenciar = calculadora.potenciar(2, 2);
        System.out.println(potenciar);

        Soma soma = new Calculadora();
        soma.soma(10,10);

        Subtracao subtracao = new Calculadora();
        subtracao.subtracao(10,10);

        Divisao divisao = new Calculadora();
        divisao.dividir(10,10);
    }
}
