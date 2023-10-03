package cap05.laboratorio;

public class TesteAluno {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Cristiane");
        aluno.setMatricula(123456789);
        aluno.setIdade(32);

        System.out.println("Aluno(a): " + aluno.getNome() + "\nMatricula: " + aluno.getMatricula() + "\nIdade: " + aluno.getIdade());

    }
}
