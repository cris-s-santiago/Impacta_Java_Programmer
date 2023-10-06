package cap08.laboratorio.lab01;

import java.util.Scanner;

public class Cap8_Lab1_Test2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int input = scanner.nextInt();

        System.out.println("O numero digitado foi: " + input +"\n");


        int[] array = {input};

        int result = Cap8_Lab1.maiorNumero1(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("\nO maior numero encontrado foi: " + result);
    }
}
