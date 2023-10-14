package cap09.herancaAula;

//Funcionario é uma Pessoa
//Funcionario é subClasse - Pessoa é superClasse
//Funcionario conhecido como classe filho - Pessoa conhecido como classe pai
public class Funcionario extends Pessoa {

    private String matricula;
    private String salario;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public void imprimir() {
        System.out.println("Nome: " + super.nome);
        System.out.println("Idade: " + super.idade);
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Nome: " + super.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Salario: " + this.salario);
    }
}
