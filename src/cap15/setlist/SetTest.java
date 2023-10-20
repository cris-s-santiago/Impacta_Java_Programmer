package cap15.setlist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        Set<String> paises = new HashSet<>();

        paises.add("Brasil");       //0
        paises.add("Portugal");     //1
        paises.add("EUA");          //era 2 -> 3
        paises.add("Franca");       //era 3 -> 4
        paises.add("Inglaterra");   //era 4 -> 5
        paises.add("Italia");

        System.out.println("-------------- Nao garante a orde de adicao");
        paises.forEach(System.out::println);

        Set<String> paisesTreeSet = new TreeSet<>();

        paisesTreeSet.add("Brasil");       //0
        paisesTreeSet.add("Portugal");     //1
        paisesTreeSet.add("EUA");          //era 2 -> 3
        paisesTreeSet.add("Franca");       //era 3 -> 4
        paisesTreeSet.add("Inglaterra");   //era 4 -> 5
        paisesTreeSet.add("Italia");

        System.out.println("-------------- Ja adiciona por ordem alfabetica");
        paisesTreeSet.forEach(System.out::println);

        System.out.println();
        System.out.println("-------------- Interator");
        Iterator<String> interator = paises.iterator();

        while (interator.hasNext()){
            String pais = interator.next();
            if (pais == "Brasil"){
                System.out.println(pais);
            }
        }

        paises.forEach(pais -> {
            if (pais == "Brasil"){
                System.out.println(pais);
            }
        });
    }
}
