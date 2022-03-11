package classes;

public class ContaPoupanca extends ContaBancaria {
    private double juros;

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    @Override
    public void depositar(double depositar){
        this.saldo = this.saldo + depositar + (depositar * this.juros);
    }
}
