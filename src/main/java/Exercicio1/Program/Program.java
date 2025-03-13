package Exercicio1.Program;

import Exercicio1.Carro.Carro;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a marca do carro: ");
        String marca = sc.nextLine();

        System.out.print("Insira o ano do carro: ");
        int ano = sc.nextInt();

        Carro carro = new Carro(marca ,ano);

        System.out.println();
        System.out.println("Marca carro: " + carro.getMarca());
        System.out.println("Ano carro: " + carro.getAno());
    }
}
