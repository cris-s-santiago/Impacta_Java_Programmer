package cap10.apostila;

public class AppGeladeira {
    public static void main(String[] args) {

        Eletromestico geladeira = new Geladeira();
        geladeira.ligar();
        geladeira.desligar();

        Eletromestico televisao = new Televisao();
        televisao.ligar();
        televisao.desligar();

        Televisao televisao2 = new Televisao();
        televisao2.trocarCanal();

        //cast de objetos somente por heranca ou interface
        Televisao televisao3 = (Televisao) televisao;
        televisao3.trocarCanal();

        int voltagem = Eletromestico.voltagem;

        System.out.println("**************");
        Eletromestico.ligar(geladeira, televisao, televisao2, televisao3);
    }

}
