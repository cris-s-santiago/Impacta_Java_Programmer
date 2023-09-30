package cap02;

public class Variaveis {
    public static void main(String[] args) {

        //tipo variavel  nome da variavel = atribuicao
        byte dia = 6;
        short mes = 12;
        int ano = 2023;
        long idade = 250_000_000_000_000_000L;

        //System.out.print(dia);

        float valorFloat = 4.5F;
        double valorDouble = 10.9;

        char caracter = 'A';
        caracter = 0x41;

        boolean falso = false;
        boolean verdadeiro =  true;


        byte variavel1, variavel2, variavel3;

        variavel1 = 1;
        variavel2 = 2;
        variavel3 = 3;

        int inteiro;
        inteiro = 10;

//        System.out.println("Ola \n mundo!");

        String texto = "Esse é um \n texto  maior que um caracter";

        DiasDaSemana seg = DiasDaSemana.SEG;
        System.out.println(seg);

        DiasDaSemana sab = DiasDaSemana.SAB;
        System.out.println(sab);

    }
}
