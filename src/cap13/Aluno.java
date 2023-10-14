package cap13;

import cap09.laboratorio.Pessoa;
import cap09.laboratorio.Rg;

public class Aluno extends Pessoa {

    private float mensalidade;
    private String curso;

    public Aluno(String nome, int idade, char sexo, int numeroRg, String dataNasc, float mensalidade, String curso) {
        super(nome, idade, sexo, new Rg(numeroRg, dataNasc)); // construtor da superClasse
        this.mensalidade = mensalidade;
        this.curso = curso;
    }

    public Aluno(String nome, int idade, char sexo, Rg rg, float mensalidade, String curso) {
        super(nome, idade, sexo, rg);
        this.mensalidade = mensalidade;
        this.curso = curso;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "mensalidade=" + mensalidade +
                ", curso='" + curso + '\'' +
                '}';
    }

    @Override
    public void falar(String fala) {
        System.out.println(super.getNome() + ": " + fala);
    }

    @Override
    public void mostrarDados() {
        System.out.println(toString());
        System.out.println(super.toString());
        System.out.println();

    }
}
