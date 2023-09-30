package cap04;

public class WHILE {

    public static void main(String[] args) {

        //WHILE
        // Loop infinito
//        while (true) {
//            System.out.println("Estou em loop infinito");
//        }
//        while (numero > 10) {
//            System.out.println("Estou em loop infinito");
//        }

        int numero = 10;

        while (numero > 0) {
            System.out.println("O valor do número é: "+ numero);
            numero--;
        }

        numero = 10;

        System.out.println("*************************************");

        while (numero-- > 0) {
            System.out.println("O valor do número é: "+ numero);
        }


        // DO WHILE

        System.out.println("*************************************");

        numero = 10;
        do {
            System.out.println("O valor do número é: "+numero);
        }while (--numero > 0);

    }
}
