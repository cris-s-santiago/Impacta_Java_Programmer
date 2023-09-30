package cap05;

public class Pessoa {

    //Atributos
    String nome;
    int idade;
    String pais;
    double altura;

    void falar(){
        System.out.println("Eu estou falando algo");
    }

    void andar(){
        System.out.println("Eu estou andando algo");
    }

    void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Pais: " + pais);
        System.out.println("Altura: " + altura);
    }

}


