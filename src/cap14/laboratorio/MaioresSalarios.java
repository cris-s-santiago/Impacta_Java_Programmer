package cap14.laboratorio;

public class MaioresSalarios {

    public static void main(String[] args) {

        double[] salariosBrutos = {1350.00, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00};

        double[] salariosTop = DoubleArrayUtils.filtraValores(salariosBrutos, salario -> salario >= 3000);

//        for (double salario : salariosTop){
//            System.out.println(salario);
//        }

        DoubleArrayUtils.processaValores(salariosTop, System.out::println);
    }
}
