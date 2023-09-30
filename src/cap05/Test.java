package cap05;

public class Test {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Cristiane";
        pessoa.idade = 32;
        pessoa.pais = "Canada";
        pessoa.altura = 1.65;

        pessoa.falar();
        pessoa.andar();

        Pessoa joao = new Pessoa();

        joao.nome = "Jao";
        joao.idade = 30;
        joao.pais = "Brasil";
        joao.altura = 1.70;

        joao.falar();
        joao.andar();


        Carro fiat = new Carro();

        fiat.carro = "Uno";
        fiat.motorista = joao;

        System.out.println("O nome do objeto joao é: " + joao.nome);

        joao.imprimir();
    }
}
