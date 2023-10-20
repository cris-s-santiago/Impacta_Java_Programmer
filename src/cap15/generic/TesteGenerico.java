package cap15.generic;

import cap07.Aluno;
import cap15.generic.Generico2;

public class TesteGenerico {

    public static void main(String[] args) {

        String texto = "Ola";

        Generico2<Object> generico = new Generico2();
        generico.setValue(10);
        generico.setValue("Texto");
        generico.setValue(new Aluno());
        generico.setValue("10");
        generico.setValue("new Aluno()");


        Generico2<?> generico1 = new Generico2();
//        generico1.setValue(10);
//        generico1.setValue("Texto");
//        generico1.setValue(new Aluno());
//        generico1.setValue("10");
//        generico1.setValue("new Aluno()");

        Generico2<String > generico2 = new Generico2();
        generico2.setValue("10");
        //generico2.setValue(10); So aceita String



    }
}
