package cap08;

import cap07.Aluno;

public class TestArrays {
    public static void main(String[] args) {
        //Sem array
        int valor1 = 5;
        int valor2 = 2;
        int valor3 = 52;
        int valor4 = 63;
        int valor5 = 30;
        int valor6 = 25;
        int valor7 = 52;


        //Usando array unidimensional

        int[] array; //null
        array = new int[2];

        int[] array1 = new int[3]; // 3 index
        //index inicializa sempre em 0
        array1[0] = 56;
        array1[1] = 30;
        array1[2] = 4;
        System.out.print(array1[2]);

        Aluno[] alunos = new Aluno[5];

        alunos[0] = new Aluno("Cristiane", 54654, 30);
        alunos[1] = new Aluno("Paula", 165464, 20);

        alunos[0].imprimir();
        System.out.println();


        // Array anônimo
        int[] array4 = new int[]{56, 30, 4, 10};


        int[] array2 = {56, 30, 4, 10}; // 4 elementos
        System.out.println("Percorrer um array unidimensional: ");
        for (int i = 0; i <= 3; i++) {
            System.out.println(array2[i]);
        }

        System.out.println();
        System.out.println("Percorrer um array unidimensional usando o langth como limitador do for: ");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }


        //Usando array bidimensional

        int[][] notasBI = new int[3][2];

        //turma 0
        notasBI[0][0] = 5;
        notasBI[0][1] = 10;

        //turma 1
        notasBI[1][0] = 10;
        notasBI[1][1] = 10;

        //turma 2
        notasBI[2][0] = 3;
        notasBI[2][1] = 4;

        System.out.println("Percorrer um array bidimensional: ");
        for (int x = 0; x < notasBI.length; x++) {
            for (int y = 0; y < notasBI[x].length; y++) {
                System.out.print(notasBI[x][y]);
                System.out.print(" ");
            }
            System.out.println();
        }


        //Usando array multidimensional

        //[unidade][turma][turma]
        int[][][] notas = new int[3][2][3];

        //unidade-0 turma-0 aluno-(0,1,2)
        notas[0][0][0] = 1;
        notas[0][0][1] = 1;
        notas[0][0][2] = 1;

        //unidade-0 turma-1 aluno-(0,1,2)
        notas[0][1][0] = 2;
        notas[0][1][1] = 2;
        notas[0][1][2] = 2;

        //unidade-1 turma-0 aluno-(0,1,2)
        notas[1][0][0] = 3;
        notas[1][0][1] = 3;
        notas[1][0][2] = 3;

        //unidade-1 turma-1 aluno-(0,1,2)
        notas[1][1][0] = 4;
        notas[1][1][1] = 4;
        notas[1][1][2] = 4;

        //unidade-2 turma-0 aluno-(0,1,2)
        notas[2][0][0] = 5;
        notas[2][0][1] = 5;
        notas[2][0][2] = 5;

        //unidade-2 turma-1 aluno-(0,1,2)
        notas[2][1][0] = 6;
        notas[2][1][1] = 6;
        notas[2][1][2] = 6;

        System.out.println("Percorrer um array multidimensional: ");
        for (int x = 0; x < notas.length; x++) {
            for (int y = 0; y < notas[x].length; y++) {
                for (int z = 0; z < notas[x][y].length; z++) {
                    System.out.print(notas[x][y][z]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }


        //For each

        int[] array3 = {56, 30, 4, 10, 6}; // 5 elementos
        System.out.println("Percorrer um array with for each: ");

        for (int i : array3) {
            System.out.println(i);
        }

        int resultado = 0;
        for (int i : array3) {
            resultado += i;
        }
        System.out.println();
        System.out.println("Soma a cada iteraçao é: " + resultado);



        // Array com args

        System.out.println();
        for (String i : args) {
            System.out.println(i);
        }

    }

}
