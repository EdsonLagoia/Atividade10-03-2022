package main;

import classes.Gerente;
import classes.Secretaria;

public class main {

    public static void main(String[] args) {
        // Gerente        
        Gerente g = new Gerente();
        g.setNome("Edson Lagoia");
        g.setCpf("000.000.000-00");
        g.setData_nascimento("17/08/1999");
        g.setSalario(5000.00);
        g.setLogin("edson.lagoia");
        g.setSenha("12345");
        System.out.println("Gerente"
                + "\nNome: " + g.getNome()
                + "\nLogin: " + g.getLogin()
                + "\nCPF: " + g.getCpf()
                + "\nData de Nascimento: " + g.getData_nascimento()
                + "\nSalario: R$ " + g.getSalario()
                + "\nBonificação: R$ " + g.bonificacao());
        
        // Secretaria
        Secretaria s = new Secretaria();
        s.setNome("Edson Lagoia");
        s.setCpf("000.000.000-00");
        s.setData_nascimento("17/08/1999");
        s.setSalario(3500.00);
        System.out.println("\nSecretário"
                + "\nNome: " + s.getNome()
                + "\nCPF: " + s.getCpf()
                + "\nData de Nascimento: " + s.getData_nascimento()
                + "\nSalario: R$ " + s.getSalario()
                + "\nBonificação: R$ " + s.bonificacao());
        
    }
    
}
