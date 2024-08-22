package com.banco.modelos;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(int numero, String titular, double taxaRendimento) {
        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        double saldoAtual = getSaldo();
        depositar(saldoAtual * taxaRendimento);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
}
