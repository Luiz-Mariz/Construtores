package Exercicio3.Program;

import Exercicio3.ContaBancaria.ContaBancaria;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu titular: ");
        String titular = sc.next();

        System.out.print("Informe seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.print("Insira seu tipo de conta: ");
        String tipoConta = sc.next();


        ContaBancaria contaBancaria = new ContaBancaria(titular, saldo, tipoConta);
        System.out.println(contaBancaria.toString());
        ContaBancaria contaBancaria1 = new ContaBancaria(titular);
        System.out.println(contaBancaria1.toString());
    }
}
