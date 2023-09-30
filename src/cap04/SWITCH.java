package cap04;

public class SWITCH {

    public static void main(String[] args) {

        String mes = "jan";

        switch (mes){

            //Structural example:
            case "set1" : {} break;

            case "jan" : {
                System.out.println("O mês inserido foi:");
                System.out.println("Janeiro");
                break;
            }case "fev" : {
                System.out.println("Fevereiro");
                break;
            }case "mar" : {
                System.out.println("Março");
                break;
            }case "abr" : {
                System.out.println("Abril");
                break;
            }case "mai" : {
                System.out.println("Maio");
                break;
            }case "jun" : {
                System.out.println("Junho");
                break;
            }case "jul" : {
                System.out.println("Julho");
                break;
            }case "ago" : {
                System.out.println("Agosto");
                break;
            }case "set" : {
                System.out.println("Setembro");
                break;
            }case "out" : {
                System.out.println("Outubro");
            break;
            }case "nov" : {
                System.out.println("Novembro");
                break;
            }case "dez" : {
                System.out.println("Dezembro");
                break;
            }
            default:
                System.out.println("Esse nao é um mês valido");
        }
    }
}
