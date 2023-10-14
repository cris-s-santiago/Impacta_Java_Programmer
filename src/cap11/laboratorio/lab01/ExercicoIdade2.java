package cap11.laboratorio.lab01;

import javax.swing.*;
import java.util.Scanner;

public class ExercicoIdade2 {

    public static void main(String[] args) {

        int anoNascimento = 0;
        do {
            String texto = JOptionPane.showInputDialog("Digite o ano do seu nascimento: ");
            try {
                anoNascimento = Integer.parseInt(texto);
                int idade = 2023 - anoNascimento;
                JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + "anos");
            } catch (NumberFormatException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Valor digitado inválido");
                System.out.println();
            }
        } while (anoNascimento == 0);
    }
}
