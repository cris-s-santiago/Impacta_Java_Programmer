package cap11.laboratorio.lab01;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ExercicioGravacao {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Digite um texto: ");
        PrintWriter writer = null;

        try {
            writer = new PrintWriter("C:\\TesteJava\\doc1.txt");
            writer.append(texto);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
