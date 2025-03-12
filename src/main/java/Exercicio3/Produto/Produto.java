package Exercicio3.Produto;

public class Produto {
    private String name;
    private double preco;
    private int estoque;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double price) {
        if (price > 0){
            this.preco =+ price;
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void addStock(int quantity){
        this.estoque += quantity;
    }

    public void removeStock(int quantity){
        if (estoque >= quantity){
            this.estoque -= quantity;
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }
}
