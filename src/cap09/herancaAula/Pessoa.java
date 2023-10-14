package cap09.herancaAula;

public class Pessoa {

    protected String nome;
    protected int idade;
    //private nao tem acesso na subclasse
    private String cpf;
    private String nacionalidade;
    private String naturalidade;
    private Tipo tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Tipo getTipo() {
        return tipo;
    }

    protected void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
