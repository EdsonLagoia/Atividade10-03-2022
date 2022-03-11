package main;

import classes.ContaCorrente;
import classes.ContaPoupanca;

public class main {

    public static void main(String[] args) {
        // Conta Corrente
        ContaCorrente cc = new ContaCorrente();
        cc.setTitular("Edson Lagoia");
        cc.setNumero("1010-X");
        cc.setSaldo(5000.00);
        cc.setTaxa(7.50);
        
        System.out.println("Conta Corrente");
        System.out.println("Titular: " + cc.getTitular());
        System.out.println("Conta: " + cc.getNumero());
        System.out.println("Saldo: R$ " + cc.getSaldo());
        cc.sacar(500.00);
        System.out.println("Saldo após saque: R$ " + cc.getSaldo());
        
        // Conta Poupança
        ContaPoupanca cp = new ContaPoupanca();
        cp.setTitular("Edson Lagoia");
        cp.setNumero("2020-Y");
        cp.setSaldo(2000.00);
        cp.setJuros(0.05);
        
        System.out.println("\nConta Poupança");
        System.out.println("Titular: " + cp.getTitular());
        System.out.println("Conta: " + cp.getNumero());
        System.out.println("Saldo: R$ " + cp.getSaldo());
        cp.depositar(500.00);
        System.out.println("Saldo após deposito: R$ " + cp.getSaldo());
    }
    
}
