package Exercicio2.Pessoa;

public class Pessoa {
    private String nome;
    private int  idade;

    public Pessoa(String nome, int  idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
        this.nome = "Desconhecido";
        this.idade = 0;
    }

    @Override
    public String toString() {
        return "Nome ='" + nome + '\'' +
                ", Idade =" + idade ;
    }
}
