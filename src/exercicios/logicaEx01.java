package exercicios;

public class logicaEx01 {

public String nome ;
public double salarioBruto;
public double taxa;


public double salarioLiquido()
{
    return salarioBruto - taxa;
}

public void aumentoSalario(double porcentagem)
{
    salarioBruto += salarioBruto * porcentagem / 100.0;
}

public String toString()
{
    return nome + " , R$ " + String.format("%.2f", salarioLiquido());
}


}
