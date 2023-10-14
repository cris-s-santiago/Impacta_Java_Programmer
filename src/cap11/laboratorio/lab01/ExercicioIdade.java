package cap11.laboratorio.lab01;

import java.util.Scanner;

public class ExercicioIdade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int anoNascimento = 0;
        do {
            System.out.print("Digite o ano do seu nascimento: ");
            String texto = scanner.nextLine();

            try {
                anoNascimento = Integer.parseInt(texto);
                int idade = 2023 - anoNascimento;
                System.out.println("Sua idade é: " + idade);
            } catch (NumberFormatException e) {
                System.out.println(e);;
                System.out.println("Valor digitado inválido");
                System.out.println();
            }
        } while (anoNascimento == 0);

    }
}
