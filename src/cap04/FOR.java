package cap04;

public class FOR {

    public static void main(String[] args) {

        for (int numero = 10 ;  numero >= 0 ; numero--){
            System.out.println("O valor do número é: "+numero);
        }

        System.out.println("************************************");

        for (int numero = 10 ;  numero < 100 ; numero *= 2){
            System.out.println("O valor do número é: "+numero);
        }

        System.out.println("************************************");

        for (int numero = 10; numero <1000; numero *= 2){
            if (numero > 40){
                break;
            }
            System.out.println("O valor do número é: "+numero);
        }
        System.out.println("Finalizou o looping");


        System.out.println("************************************");

        for (int i = 10; i > 0; i--){
            System.out.print("\nPrimeiro for i: " + i);

            for (int j = 10; j > 0; j--){
                System.out.print(" j: " + j);
            }
        }
    }
}
