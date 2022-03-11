package classes;

public class ContaCorrente extends ContaBancaria {
    private double taxa;

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    @Override
    public void sacar(double sacar){
        this.saldo = this.saldo - sacar - this.taxa;
    }
}
