package com.banco.servicos;


import com.banco.modelos.ContaCorrente;
import com.banco.modelos.ContaPoupanca;

public class Banco {
    public void realizarOperacao() {
        ContaCorrente cc = new ContaCorrente(1001, "João Silva", 500.0);
        cc.depositar(1000.0);
        cc.sacar(1200.0);
        System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca(1002, "Maria Silva", 0.05);
        cp.depositar(2000.0);
        cp.aplicarRendimento();
        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());
    }
}
