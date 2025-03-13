package Exercicio2.Program;

import Exercicio2.Pessoa.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);
        Pessoa pessoaVazia = new Pessoa();

        System.out.println(pessoaVazia.toString());
        System.out.println(pessoaVazia.toString());
    }
}
