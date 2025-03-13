package Exercicio3.ContaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String tipoConta;

    public ContaBancaria(String titular, double saldo, String tipoConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.tipoConta = "Corrente";
    }

    @Override
    public String toString() {
        return "ContaBancaria {" +
                "titular = '" + titular + '\'' +
                ", saldo = " + saldo +
                ", tipoConta = '" + tipoConta + '\'' +
                '}';
    }
}
