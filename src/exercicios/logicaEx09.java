package exercicios;



public class logicaEx09 {

    private int id;
    private String nome;
    private double salario;

    public logicaEx09(int id, String nome, double salario)
    {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId()
    {
        return id;
    }

    public void aumentarSalario(double porcentagem)
    {
        salario += salario * porcentagem / 100.0;
       
    }

    public String toString()
    {
        return id + ": " + nome + " , " + String.format("%.2f", salario);
    }

 
    
}
