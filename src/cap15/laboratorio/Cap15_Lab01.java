package cap15.laboratorio;

import cap09.laboratorio.Pessoa;
import cap09.laboratorio.Professor;

import java.util.HashMap;

public class Cap15_Lab01 {

    public static void main(String[] args) {

        HashMap<String, Integer> pessoaMap = new HashMap<>();

        pessoaMap.put("Roberto", 35);
        pessoaMap.put("Carla", 26);
        pessoaMap.put("Gabriel", 18);
        pessoaMap.put("Bruna", 17);

        System.out.println("-- Pessoas --");
        System.out.println("Roberto: " + pessoaMap.get("Roberto"));
        System.out.println("Carla: " + pessoaMap.get("Carla"));
        System.out.println("Gabriel: " + pessoaMap.get("Gabriel"));
        System.out.println("Bruna: " + pessoaMap.get("Bruna"));

        System.out.println("-- Pessoas com Labda--");
        pessoaMap.forEach((key, value) -> {
            System.out.print(key + ": " + value);
            System.out.println();
        });

    }

}
