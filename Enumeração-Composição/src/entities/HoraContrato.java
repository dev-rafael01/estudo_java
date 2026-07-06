package entities;

import java.util.Date;


public class HoraContrato {

    private Date data;
    private double ValorPorHora;
    private Integer Horas;

    public HoraContrato(){

    };

    public HoraContrato(Date data, double ValorPorHora, Integer Horas)
    {
        this.data = data;
        this.ValorPorHora = ValorPorHora;
        this.Horas = Horas;
    }

}
