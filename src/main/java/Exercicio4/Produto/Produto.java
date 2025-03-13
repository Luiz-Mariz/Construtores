package Exercicio4.Produto;

public class Produto {
    private String nome;
    private double preco;

    public Produto(double preco) {
        if (preco < 0){
            this.preco = 0.0;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
