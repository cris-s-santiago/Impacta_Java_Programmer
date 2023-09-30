package cap05.laboratorio;

public class TesteAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.nome = "Cristiane";
        aluno.matricula = 123456789;
        aluno.idade = 32;

        System.out.println("Aluno(a): " + aluno.nome + "\nMatricula: " + aluno.matricula + "\nIdade: " + aluno.idade);

    }
}
