package cap05.laboratorio_02.carro;

public class Garagem {

    public Carro carroPasseio;
    public Carro carroUtilitario;

    public static void main(String[] args) {

        Garagem g  = new Garagem();

        Carro carroPasseio = new Carro();
        Carro carroUtilitario = new Carro();


        carroPasseio.cor = "vermelho";
        carroPasseio.modelo = "VW Jetta";
        carroPasseio.potenciaDoMotor = 2.3;

        carroUtilitario.cor = "branco";
        carroUtilitario.modelo = "Renault Boxer";
        carroUtilitario.potenciaDoMotor = 3.8;

        g.carroPasseio = carroPasseio;
        g.carroUtilitario = carroUtilitario;

        System.out.println("Carro de Passeio: ");
        System.out.println("Cor: " + g.carroPasseio.cor);
        System.out.println("Modelo: " + g.carroPasseio.modelo);
        System.out.println("Potência: " + g.carroPasseio.potenciaDoMotor);

        System.out.println();

        System.out.println("Carro Utilitário: ");
        System.out.println("Cor: " + g.carroUtilitario.cor);
        System.out.println("Modelo: " + g.carroUtilitario.modelo);
        System.out.println("Potência: " + g.carroUtilitario.potenciaDoMotor);

        // Uso de metodos
        System.out.println();
        g.carroPasseio.imprimir();
        System.out.println();
        g.carroUtilitario.imprimir();
    }

}
