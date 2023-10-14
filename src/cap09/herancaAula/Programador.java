package cap09.herancaAula;

public class Programador extends Funcionario{

    private String linguagem;

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void imprimir() {
        System.out.println("Nome: " + super.nome);
        System.out.println("Idade: " + super.idade);
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Linguagem: " + super.getMatricula());
        System.out.println("Linguagem: " + this.linguagem);
    }
}
