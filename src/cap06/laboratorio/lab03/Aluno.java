package cap06.laboratorio.lab03;

public class Aluno {

    public static int contadorDeAlunos;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void imprimeAluno() {
        System.out.println("Aluno: " + this.name);
        System.out.println("Contagem no objeto " + this.name + " : " + contadorDeAlunos);
    }
}
