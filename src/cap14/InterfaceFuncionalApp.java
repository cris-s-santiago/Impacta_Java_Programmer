package cap14;

public class InterfaceFuncionalApp {

    public static void main(String[] args) {

        OperacaoAritmetica soma = new OperacaoAritmeticaImpl();
        System.out.println(soma.executar(10, 10));

        //Interface funcional não precisa de classe de implementação
        // lambda ->
        OperacaoAritmetica somaFuncional = ((valor1, valor2) -> valor1 + valor2);
        System.out.println(somaFuncional.executar(10, 10));

        //Pode se criar o contrato durante o codigo
        OperacaoAritmetica subtracaoFuncional = ((valor1, valor2) -> {
            return valor1 - valor2;
        });
        System.out.println(subtracaoFuncional.executar(10, 10));

        Imprimir imprimir = palavra -> System.out.println(palavra);
        imprimir.imprimirConsole("Minha interface funcional");

        Imprimir2 imprimir2 = () -> System.out.println("Minha interface funcional 2");
        imprimir2.imprimirConsole();
    }
}
