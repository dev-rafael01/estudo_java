package entities;

public class Retangulo {
    
public Double largura;
public Double altura;



public double area()
{
    return largura * altura;
}

public double perimetro()
{
    return (largura + altura) * 2;
}

public double diagonal()
{
    double n1 = largura * largura;
    double n2 = altura *  altura;
    
     double resultado = Math.sqrt(n1 + n2);
     return resultado;   

}



}
