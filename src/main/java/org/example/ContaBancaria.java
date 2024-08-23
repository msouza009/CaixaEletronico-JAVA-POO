package org.example;

public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    //REGRAS DE NEGÓCIO
    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) { //se o valor de deposito for maior que 0
            saldo = saldo + valorDeposito;
            // saldo += valorDeposito; (OUTRA OPÇAO)
            System.out.println("DEPOSITO EFETUADO\nSALDO ATUAL : R$ " + saldo);
        }else
            System.out.println("DEPÓSITO INVÁLIDO.");
    }
    public void sacar() {

    }

}
