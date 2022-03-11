package classes;

public class Secretaria extends Funcionario {
    private int ramal;

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    @Override
    public double bonificacao(){
        return salario * 0.15;
    }
}
