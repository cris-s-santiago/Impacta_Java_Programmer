package cap15.setlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListaTeste {

    public static void main(String[] args) {

        List<String> paises = new ArrayList<>(); // inicia com 10 e adiciona mais 10 se necessario e assim por diante
        List<String> paisesVector = new Vector<>(80); // posso iniciar ja com um valor expecifico
        List<String> paisesListaEncadeada = new LinkedList<>();

        ArrayList<String> paisesArrayList = new ArrayList<>(); //Pode ser iniciado como ArrayList direto

        paises.add("Brasil");       //0
        paises.add("Portugal");     //1
        paises.add("EUA");          //era 2 -> 3
        paises.add("Franca");       //era 3 -> 4
        paises.add("Inglaterra");   //era 4 -> 5
        paises.add("Italia");       //era 5 -> 6
        paises.add(2, "Canada");// forcei o idex 2

        System.out.println("---------- foreach");
        for (String pais : paises) {
            System.out.println(pais);
        }

        String Brasil = paises.get(0); //Pega o pais na posicao do idex
        boolean contem = paises.contains("Brasil"); // verifica se cotem a String na lista
        int indexOfPais = paises.indexOf("Franca"); // 4 -- Retorna o index d de onde contem a informacao
        String pais = paises.get(indexOfPais); // Franca -- Pega a String

        System.out.println("---------- exemplo do size");
        System.out.println("O tamanho da Lista e: " + paises.size());

        System.out.println("---------- exemplo de uso");
        //Exemplo de uso
        if (indexOfPais >= 0) {
            System.out.println(pais);
        } else {
            System.out.println("Pais nao esta na lista");
        }

        System.out.println("---------- foreach interface funcional");
        paises.forEach(paisForEach -> {
            System.out.print("Cada pais da lista: ");
            System.out.println(paisForEach);
        });

        System.out.println("---------- Replace todos os paises para letra maiuscila");
        paises.replaceAll(paisReplace -> paisReplace.toUpperCase());

        System.out.println("---------- foreach apos o replace");
        paises.forEach(paisForEach -> {
            System.out.print("Cada pais da lista: ");
            System.out.println(paisForEach);
        });

        System.out.println("---------- sort para ordem alfabetica");
        paises.sort((x,y) -> x.compareTo(y));

        System.out.println("---------- foreach apos o sort");
        paises.forEach(paisForEach -> {
            System.out.print("Cada pais da lista: ");
            System.out.println(paisForEach);
        });

        System.out.println("---------- remove pode remover pelo objeto ou index");
        paises.remove("BRASIL");
        paises.remove(0);

        System.out.println("---------- foreach apos remove");
        paises.forEach(paisForEach -> {
            System.out.print("Cada pais da lista: ");
            System.out.println(paisForEach);
        });

        System.out.println("---------- clear limpa a lista toda");
        paises.clear();
        paises.forEach(paisForEach -> {
            System.out.print("Cada pais da lista: ");
            System.out.println(paisForEach);
        });
    }
}
