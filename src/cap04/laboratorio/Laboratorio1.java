package cap04.laboratorio;

public class Laboratorio1 {

    public static void main(String[] args) {

        int numero = 10;
        int cont = 0;

        for (int i = 1; i < numero; i++){

            if (numero % i == 0) {
                cont++;
            }
        }

        if (cont > 2){
            System.out.println(numero+" nao é um numero primo");;
        }else {
            System.out.println(numero+" é um numero primo");;
        }


    }
}
