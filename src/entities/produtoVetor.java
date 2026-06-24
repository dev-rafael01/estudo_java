package entities;

public class produtoVetor {

    private String nome;
    private double valor;

    public  produtoVetor(String nome, double valor)
    {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome()
    {
        return nome;
    }
    public void setValor(String novoNome)
    {
        this.nome = novoNome;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double novoValor)
    {
        this.valor = novoValor;
    }
    
}
