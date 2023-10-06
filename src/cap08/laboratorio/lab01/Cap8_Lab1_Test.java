package cap08.laboratorio.lab01;

public class Cap8_Lab1_Test {

    public static void main(String[] args) {

        int[] array = {1, 6, 9, 10, 358, 2};

        int result = Cap8_Lab1.maiorNumero1(array);

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("\nO maior numero encontrado foi: "+result);
    }
}
