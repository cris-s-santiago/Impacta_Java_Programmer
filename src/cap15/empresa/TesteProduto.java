package cap15.empresa;

public class TesteProduto {
    public static void main(String[] args) {

        Produto leite = new Produto(1234, "Laite", 100, 10);
        System.out.println(leite);

        leite.setQuantidade(50);
        System.out.println(leite);

        leite.adicionarQuantidadeProduto(200);
        System.out.println(leite);

        leite.subtrairQuantidadeProduto(10);
        System.out.println(leite);

        System.out.println(leite.quantidadeMinimaEstoque());
    }
}
