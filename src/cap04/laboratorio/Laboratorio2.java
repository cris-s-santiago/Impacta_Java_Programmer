package cap04.laboratorio;

public class Laboratorio2 {

    public static void main(String[] args) {

        String mes = "nov";

        switch (mes){
            case "fev" :{System.out.println("O mes escolhido tem 28 dias");break;}
            case "jan" :
            case "mar" :
            case "mai" :
            case "jul" :
            case "ago" :
            case "out" :
            case "dez" :{System.out.println("O mes escolhido tem 31 dias");break;}
            case "abr" :
            case "jun" :
            case "set" :
            case "nov" :{System.out.println("O mes escolhido tem 30 dias");break;}
            default: {System.out.println("Esse nao é um mês valido");}
        }
    }
}
