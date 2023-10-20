package cap15.setlist;

import cap15.Map.Produto;

import java.util.HashSet;
import java.util.Set;

public class SetLista2 {

    public static void main(String[] args) {

        Set<Produto> produtos = new HashSet<>();
        produtos.add(new Produto("Leite em po", "Laticinios", 10.00));
        produtos.add(new Produto("Cerveja em Lata", "Bebidas", 1.89));
        produtos.add(new Produto("Detergente", "Limpeza", 2.49));
        produtos.add(new Produto("Manteiga", "Laticinios", 2.90));
        produtos.add(new Produto("Pasta de dente", "Limpeza", 1.75));

        produtos.remove(produtos);
        produtos.removeIf(produto -> produto.getPreco() < 1.80);
        produtos.removeIf(produto -> produto.getNome() == "Manteiga");
        produtos.removeIf(produto -> produto.getCategoria() == "Laticinios");
    }
}
