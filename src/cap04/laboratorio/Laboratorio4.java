package cap04.laboratorio;

public class Laboratorio4 {

    public static void main(String[] args) {

        /*
        Crie um código que leia a nota de um aluno e mostre se ele está: aprovado (acima de 60),
        em recuperação (abaixo de 60) ou reprovado (abaixo de 20).
         */

        int nota = 19;

        if (nota <= 20 ){
            System.out.println("Aluno reprovado");
        } else if (nota < 60) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno aprovado");
        }
    }
}
