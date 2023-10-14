package cap13;

import java.util.Random;

public class MegasenaUtilitario {

    public static int sortearNumero(int max) {

        Random sorteador = new Random();
        int numero = sorteador.nextInt(max) + 1;

        return numero;
    }

    public static int[] numerosSorteadosMegasena() {
        //precisa voltar 6 numeros da mega sena
        //os numeros nao podem ser repeditos

        int[] jogoMegasena = new int[6];
        for (int i = 0; i < jogoMegasena.length; i++) {

            boolean validador = true;
            int numeroSorteado = sortearNumero(6);

            for (int j = 0; j < jogoMegasena.length; j++) {
                if (jogoMegasena[j] == numeroSorteado) {
                    validador = false;
                    i--;
                    break;
                }
            }
            if (validador){
                jogoMegasena[i] = numeroSorteado;
            }
        }
        return jogoMegasena;
    }
}
