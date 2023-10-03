package cap05.laboratorio;

public class Aluno {

    private String nome;
    private int matricula;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
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
