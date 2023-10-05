package cap07;

import javax.xml.namespace.QName;

public class Aluno {

    private String nome;
    private int matricula;
    private int idade;

    public Aluno(){
    }

    public Aluno(String nome, int matricula, int idade) {
        this.nome = setNome(nome);
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    private String setNome(String nome) {
        return nome.toUpperCase();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("Aluno(a): " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula:  " + matricula);
    }

}
