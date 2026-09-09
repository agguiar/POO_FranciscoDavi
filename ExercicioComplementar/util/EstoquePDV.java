package util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import model.Produto;

public class EstoquePDV {

    private Map<String, Produto> mapaEstoque = new HashMap<>();

    public void cadastrarProdutos() {

        mapaEstoque.put(
                "A101",
                new Produto("A101", "Notebook", 3500)
        );

        mapaEstoque.put(
                "B202",
                new Produto("B202", "Mouse Gamer", 150)
        );

        mapaEstoque.put(
                "C303",
                new Produto("C303", "Headset", 280)
        );

    }

    public void consultarProduto() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        String codigo = teclado.nextLine();

        Produto produto = mapaEstoque.get(codigo);

        if (produto != null) {
            System.out.println(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }

    }

    public void exibirCodigos() {

        Set<String> codigos = mapaEstoque.keySet();

        System.out.println("Códigos cadastrados:");

        for (String codigo : codigos) {
            System.out.println(codigo);
        }

    }

    public void exibirProdutos() {

        Collection<Produto> produtos = mapaEstoque.values();

        System.out.println("Produtos cadastrados:");

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

    }

}