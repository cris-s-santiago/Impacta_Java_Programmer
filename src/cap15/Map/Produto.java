package cap15.Map;

public class Produto {

    private int codigo;
    private String nome;
    private String categoria;
    private Double preco;

    public Produto(String nome, String categoris, Double preco) {
        this.nome = nome;
        this.categoria = categoris;
        this.preco = preco;
    }

    public Produto(int codigo, String nome, String categoris, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoris;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", preco=" + preco +
                '}';
    }
}
