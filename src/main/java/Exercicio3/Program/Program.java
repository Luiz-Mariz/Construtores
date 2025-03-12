package Exercicio3.Program;

import Exercicio3.Produto.Produto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Infore o nome do produto: ");
        produto.setName(sc.nextLine());

        System.out.print("Informe o preço: ");
        produto.setPreco(sc.nextDouble());

        System.out.print("Adicionar no estoque: ");
        produto.addStock(sc.nextInt());

        System.out.print("Remover no estoque: ");
        produto.removeStock(sc.nextInt());

        System.out.println();
        System.out.println("Nome Produto: " + produto.getName());
        System.out.println("Preço Produto: R$" + produto.getPreco());
        System.out.println("Quantidade Estoque: " + produto.getEstoque());
    }
}
