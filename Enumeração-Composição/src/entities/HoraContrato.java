package entities;

import java.util.Date;


public class HoraContrato {

    private Date data;
    private double valorPorHora;
    private Integer horas;

    public HoraContrato(){

    };

    public HoraContrato(Date data, double valorPorHora, Integer horas)
    {
        this.data = data;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

     public Date getData()
    {
        return data;
    }
    public void setData(Date data)
    {
        this.data = data;
    }
    
     public double getValorPorHora()
    {
        return valorPorHora;
    }
    public void setValorPorHora(double valorPorHora)
    {
        this.valorPorHora = valorPorHora;
    }
     public Integer getHora()
    {
        return horas;
    }
    public void setHoras(Integer Hora)
    {
        this.horas = Hora;
    }

    public double valorTotal()
    {
        return valorPorHora * horas;
    }


}
