package entities;

public class contaPoupanca  extends conta{

    private double taxaDeJuros;

    public contaPoupanca()
    {
        super();
    }

    public contaPoupanca(Integer numero, String titular, double saldo, double taxaDeJuros) {
        super(numero, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void  atualizarSaldo()
    {
        saldo += saldo * taxaDeJuros;
    }
    

    
    
}
