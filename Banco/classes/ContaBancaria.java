package classes;

public class ContaBancaria {
    protected String titular;
    protected double saldo;
    protected String numero;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void sacar(double sacar){
        this.saldo = this.saldo - sacar;
    }
    
    public void depositar(double depositar){
        this.saldo = this.saldo + depositar;
    }
}
