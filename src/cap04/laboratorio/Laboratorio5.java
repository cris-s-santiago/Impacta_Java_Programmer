package cap04.laboratorio;

public class Laboratorio5 {

    public static void main(String[] args) {

        /*
        Crie um código que recebe 2 números e multiplica o num1 pelo num2
        através de somas repetidas. (ex: 2 e 3 = 2 + 2 + 2);

         */

        int num1 = 10;
        int num2 = 5;
        int resultado = 0;

        System.out.print("ex: "+num1+" e "+num2+ " = ");
        for (int i = 1; i <= num2; i ++){
            resultado += num1;
            System.out.print(num1);
            if (i < num2){
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + resultado);

    }
}
