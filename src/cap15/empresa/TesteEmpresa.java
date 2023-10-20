package cap15.empresa;

public class TesteEmpresa {
    public static void main(String[] args) {

        Empresa crisInc = new Empresa("CrisInc");

        crisInc.adicionarProduto(new Produto(123, "leite", 100, 10));
        crisInc.adicionarProduto(new Produto(456, "pao", 50, 10));
        crisInc.adicionarProduto(new Produto(789, "ovo", 60, 10));

        crisInc.adicionarProduto(new Produto(1234, "leite", 100, 10));
        crisInc.adicionarProduto(new Produto(1235, "pão", 4000, 100));
        crisInc.adicionarProduto(new Produto(1236, "ovo", 3000, 100));

        crisInc.getNome();
        crisInc.getProdutoMap().forEach((key, value) -> {
            System.out.print(key + " ");
            System.out.println(value);
        } );

        crisInc.excluirProduto(1236);

        System.out.println("após exclusão do produto de codigo 1236");
        crisInc.getProdutoMap().forEach((key, value) -> {
            System.out.print(key + " ");
            System.out.println(value);
        } );

        System.out.println("lista somente de chaves");
        crisInc.retornarListaCodigo().forEach(codigo -> System.out.println(codigo));

        System.out.println("lista somente de valores");
        crisInc.retornarListaProdutos().forEach(produto -> System.out.println(produto));

        System.out.println("quantidade de produtos na empresa: " +  crisInc.tamanhoListaProduto());

        System.out.println("existe um produto com o codigo: 1236 " + crisInc.existeProduto(1234));
    }
}
