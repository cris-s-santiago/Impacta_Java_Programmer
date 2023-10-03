package cap06;

import cap05.laboratorio.Aluno;

public class Teste {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultadoSomar = calculadora.somar(10, 20);
        System.out.println(resultadoSomar);

        long resultadoSubtrair = calculadora.subtrair(10, 9);
        System.out.println(resultadoSubtrair);

        String texto = calculadora.concatenar("parte1 e ", "parte2 do texto");
        //System.out.println(calculadora.concatenar("parte1 e ", "parte2 do texto"));
        System.out.println(texto);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("cristiane");

        System.out.println("**********************");
        System.out.println(aluno1.getNome());
        System.out.println("**********************");

        aluno1.imprimir();
    }

}
