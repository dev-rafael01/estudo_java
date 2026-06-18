package exercicios;

public class logicaEx03 {

    public double cotacaoDolar;
    public double quantidadeDolar ;
    public double IOF = 6.00;



    public double converteDolar()
    {
        return  cotacaoDolar * quantidadeDolar;
        
    }

    public double imposto()
    {
        double valor = converteDolar();
        return valor + (valor * IOF / 100.0);
    }
    
}
