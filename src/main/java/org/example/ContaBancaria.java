package org.example;

public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
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
    public void sacar(double valorSaque) {
        if(valorSaque > 0 && valorSaque <= saldo){
            saldo = saldo - valorSaque;
            System.out.println("Saque efetuado. Saldo atual = "+ saldo);
        } else {
            System.out.println("Valor de saque incorreto.");
        }
    }


}
