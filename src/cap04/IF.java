package cap04;

import cap02.DiasDaSemana;

public class IF {

    public static void main(String[] args) {

        int dia = 27;

        if (dia == 27){

            System.out.println("Hoje é: "+DiasDaSemana.QUA);
        }else {
            System.out.println("Hoje não é: "+DiasDaSemana.QUA);
        }

        int horario = 20;

        if (horario <12){
            System.out.println("Bom dia");
        } else if (horario <18) {
            System.out.println("Boa tarde");
        }else {
            System.out.println("Boa noite");
        }

        if (true) {
            System.out.println("Somente um if, sem else");
        }

        if (11%2==0) {
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }
}
