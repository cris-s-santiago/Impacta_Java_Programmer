package cap08.laboratorio.lab01;

public class Cap8_Lab1 {

    public static int maiorNumero1(int[] numeros){

        int maiorNumero = 0;
        for (int item : numeros) {
            if(item >= maiorNumero){
                maiorNumero = item;
            }
        }
        return maiorNumero;
    }
}
