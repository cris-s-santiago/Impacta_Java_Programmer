package cap15.setlist;

import java.util.*;

public class MegasenaUtilitario {

    public static int sortearNumero(int max) {

        Random sorteador = new Random();
        int numero = sorteador.nextInt(max) + 1;

        return numero;
    }
    public static Set<Integer> numerosSorteados (int maxNumeros, int quantidade){

        if (maxNumeros < quantidade){
            //return new HashSet<>();
            throw new MegasenaUtilitarioException ("Quantidade nao deve ser maior que numeros sorteados");
        }

        Set<Integer> jogoMegaSena = new HashSet<>(quantidade);

        while (jogoMegaSena.size() < quantidade){
            int numeroSorteado = sortearNumero(maxNumeros);
            jogoMegaSena.add(numeroSorteado);
        }
        jogoMegaSena.forEach(System.out::println);
        return  new TreeSet<>(jogoMegaSena);
    }
}
