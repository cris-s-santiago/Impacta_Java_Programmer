package cap06.laboratorio.lab03;

public class Cap6_Lab3 {

    public static void main(String[] args) {

        Aluno joao = new Aluno();
        Aluno maria = new Aluno();
        Aluno marcos = new Aluno();

        joao.setName("João");
        joao.contadorDeAlunos++;
        joao.imprimeAluno();

        maria.setName("Maria");
        maria.contadorDeAlunos++;
        maria.imprimeAluno();

        marcos.setName("Marcos");
        marcos.contadorDeAlunos++;
        marcos.imprimeAluno();

        System.out.println("Contador acessando diretamente da classe: "+Aluno.contadorDeAlunos);



    }
}
