package entities01;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;


    public double TotalValor ()
    {
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade)
    {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade)
    {
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome + " | " + " R$ " + String.format("%.2f", preco) + " | " +  quantidade + " Unidades " + 
         " | Total R$ " +  String.format("%.2f", TotalValor()) ;
    }
    
}
