package cap09;

public class Programador extends Funcionario {

    private String linguagem;
    private String sistemaOperacional;

    public Programador() {
    }
    public Programador(String nome, String email, int idade, String linguagem, String sistemaOperacional) {
        super(nome, email, idade);
        this.linguagem = linguagem;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void imprimir() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Email: " + super.getEmail());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Linguagem: " + linguagem);
        System.out.println("Sistema Operacional: " + sistemaOperacional + "\n");
    }
}
