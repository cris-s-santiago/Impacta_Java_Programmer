package cap09.laboratorio;

public class Cap9_Lab1 {

    public static void main(String[] args) {

        Pessoa professor = new Professor(2000f, "Programacao", "Cristiane", 32, 'F', 12365875, "10/01/1191");
        professor.mostrarDados();
        Pessoa aluno1 = new Aluno("Paulo", 30, 'M', 12365875, "10/01/1191", 158f, "Programacao");
        aluno1.mostrarDados();
        Pessoa aluno2 = new Aluno("Ana", 39, 'F', 12365875, "10/01/1191", 158f, "Programacao");
        aluno2.mostrarDados();
    }
}
