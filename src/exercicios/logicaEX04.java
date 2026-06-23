package exercicios;

public class logicaEX04 {

    private String nome;
    private int Nconta;
    private double saldo;
   


    public logicaEX04 (String nome, int Nconta)
    {
        this.nome = nome;
        this.Nconta = Nconta;
        this.saldo = 0.0;
    
       
    }
    public logicaEX04 (String nome, int Nconta, double depositoInicial)
    {
        this.nome = nome;
        this.Nconta = Nconta;
        Deposito(depositoInicial);
       
    }


    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getNconta()
    {
        return Nconta;
    }

    public double getSaldo()
    {
        return saldo;
    }


   public void Deposito(double valor)
   {
    
     saldo = saldo + valor;
   }

   public void Sacar(double valor)
   {
      saldo -= valor + 5.0;
   }

 
    public String toString()
    {
        return "Conta: " + Nconta + ", Titular: " + nome + ", Saldo: R$ " + String.format("%.2f", saldo);
    }



    
}
