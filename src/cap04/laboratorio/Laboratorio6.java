package cap04.laboratorio;

import javax.swing.plaf.IconUIResource;

public class Laboratorio6 {

    public static void main(String[] args) {

        /*
        Implemente um código que leia um número e realize a soma dos números entre zero e o número lido.

         */

        int num = 6;
        int cont=0;

        for (int i = 0; i <= num; i ++) {
            cont += i;
        }

        System.out.println("A soma dos numeros é " + cont);
    }
}
