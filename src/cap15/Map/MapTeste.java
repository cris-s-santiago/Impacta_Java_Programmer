package cap15.Map;

import java.util.HashMap;
import java.util.Map;

public class MapTeste {

    public static void main(String[] args) {

        Map<Integer, Produto> produtos = new HashMap<>();

        Produto produto = new Produto(3216, "Leite em po", "Laticinios", 10.00);
        Produto produto2 = new Produto(6589, "Banana", "Fruta", 30.00);

        produtos.put(3216, produto);
        produtos.put(produto2.getCodigo(), produto2);
        produtos.put(32168, produto2);
        produtos.put(58964, new Produto(58964, "Tomate", "Fruta", 3.00));

        Produto getMapProduto = produtos.get(3216);
        System.out.println(getMapProduto);

        produtos.forEach((key, value) -> {
            System.out.print(key+ " ");
            System.out.println(value);
        });

        produtos.remove(32168);



    }
}
