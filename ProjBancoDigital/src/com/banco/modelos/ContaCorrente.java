package com.banco.modelos;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, String titular, double limiteChequeEspecial) {
        super(numero, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        double saldoComLimite = getSaldo() + limiteChequeEspecial;
        if (saldoComLimite >= valor) {
            depositar(-valor);
        } else {
            System.out.println("Saldo insuficiente, mesmo com cheque especial!");
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}
