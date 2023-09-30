package cap03;

import cap02.DiasDaSemana;

public class Operadores {

    public static void main(String[] args) {

        int valor_1 = 10;
        int valor_2 = 20;

        int soma = 10 + 20;
        int soma2 = valor_1 + valor_2;
        int subtracao = valor_1 - valor_2;
        int divicao = valor_1 / 2;
        int mutiplicacao = valor_1*valor_2;
        int modulo = 10%3;
        int divisaoInteiro = valor_1 /3;
        double divisaoDouble = 10D / 3;
        // Cast de um int em um double
        double divisaoCast = (int) 10D / 3 ;

        System.out.println(soma);
        System.out.println(soma2);
        System.out.println(subtracao);
        System.out.println(divicao);
        System.out.println(mutiplicacao);
        System.out.println(modulo);
        System.out.println(divisaoInteiro);
        System.out.println(divisaoDouble);
        System.out.println(divisaoCast);

        //Atribuicao de um novo valor
        int valor_3 = 10;
        valor_3 = valor_1 + 1;
        System.out.println(valor_3);
        valor_3 += 10;
        System.out.println(valor_3);
        valor_3 -= 10;
        System.out.println(valor_3);
        valor_3 /= 10;
        System.out.println(valor_3);
        valor_3 *= 10;
        System.out.println(valor_3);
        valor_3 %= 10;
        System.out.println(valor_3);

        //Incrementacao e decrementacao
        int valor_4 = 5;
        System.out.println(valor_4++);
        System.out.println(++valor_4);
        System.out.println(valor_4--);
        System.out.println(--valor_4);

        //Operadores relacionais
        int valor_5 = 10;
        int valor_6 = 10;

        boolean relacional1 = valor_5 > valor_6;
        boolean relacional2 = valor_5 < valor_6;
        boolean relacional3 = valor_5 >= valor_6;
        boolean relacional4 = valor_5 <= valor_6;
        boolean relacional5 = valor_5 == valor_6;
        boolean relacional6 = valor_5 != valor_6;


        //Operadores lógicos
        boolean logico = (valor_5 != valor_6 && valor_2 > valor_1) || (valor_5 <= valor_3); // 10!=10 = false

        //&&
        boolean logico2 = (valor_5 == valor_6 && valor_2 >= valor_1); // (10==10 true) && (20 >= 10 true ) = true
        boolean logico3 = (valor_5 != valor_6 && valor_2 >= valor_1); // (10!=10 false) && (20 >= 10 true ) = false
        boolean logico4 = (valor_5 == valor_6 && valor_2 < valor_1); // (10==10 true) && (20 < 10 false ) = false

        //OR
        boolean logico5 = (valor_5 == valor_6 || valor_2 >= valor_1); // (10==10 true) && (20 >= 10 true ) = true
        boolean logico6 = (valor_5 != valor_6 || valor_2 >= valor_1); // (10!=10 false) && (20 >= 10 true ) = true
        boolean logico7 = (valor_5 == valor_6 || valor_2 < valor_1); // (10==10 true) && (20 < 10 false ) = true
        boolean logico8 = (valor_5 != valor_6 || valor_2 < valor_1); // (10!=10 false) && (20 < 10 false ) = false

        //XOR
        boolean logico9 = (valor_5 == valor_6 ^ valor_2 >= valor_1); // (10==10 true) && (20 >= 10 true ) = false
        boolean logico10 = (valor_5 != valor_6 ^ valor_2 >= valor_1); // (10!=10 false) && (20 >= 10 true ) = true
        boolean logico11= (valor_5 == valor_6 ^ valor_2 < valor_1); // (10==10 true) && (20 < 10 false ) = true
        boolean logico12= (valor_5 != valor_6 ^ valor_2 < valor_1); // (10!=10 false) && (20 < 10 false ) = false

        //NOT
        boolean logico13 = !true; //false
        boolean logico14 = !false; //true

        boolean logico15= !(valor_5 != valor_6) ^ !(valor_2 < valor_1); // (!(10!=10 false)true) && (!(20 < 10 false)true) = false
        boolean logico16= !relacional5; // true


        //Ternario
        String ternario = 10 > 9 ? "verdadeiro" : "false";
        String ternario2 = 10 < 9 ? "verdadeiro" : "false";


        DiasDaSemana ternario3 = 26 == 26 ? DiasDaSemana.TER : DiasDaSemana.QUA;

        int b =5;
        b *= 10;
        System.out.println(b);

    }
}
