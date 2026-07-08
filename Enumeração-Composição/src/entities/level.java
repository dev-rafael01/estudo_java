package entities;

import java.util.ArrayList;
import java.util.List;
import entities.nivelTrabalho;
import java.util.Calendar;
import entities.HoraContrato;

public class level {

    private String nome;
    private nivelTrabalho nivel;
    private double baseSalario;

    private Departamento departamento;
    private List<HoraContrato> contratos = new ArrayList<>();

    public level()
    {

    }
    public level(String nome, nivelTrabalho nivel, double baseSalario, Departamento departamento)
    {
        this.nome = nome;
        this.nivel = nivel;
        this.baseSalario = baseSalario;
        this.departamento = departamento;
    }

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public nivelTrabalho getNivel()
    {
        return nivel;
    }
    public void setNivel(nivelTrabalho nivel)
    {
        this.nivel = nivel;
    }
    public double getBaseSalario()
    {
        return baseSalario;
    }
    public void setBaseSalario(double baseSalario)
    {
        this.baseSalario = baseSalario;
    }
    public Departamento getDepartamento()
    {
        return departamento;
    }
    public void setDepartamento(Departamento departamento)
    {
        this.departamento = departamento;
    }
    public List<HoraContrato> getContrato ()
    {
        return contratos;
    }

    public void  addContratos(HoraContrato contratos)
    {
        this.contratos.add(contratos);
    }
    public void removeContratos(HoraContrato contratos)
    {
        this.contratos.remove(contratos);
    }

    public double renda(Integer ano, Integer mes)
    {
        double soma = baseSalario;

        Calendar calendario = Calendar.getInstance();
        for (HoraContrato c : contratos)
        {
            calendario.setTime(c.getData());
            int c_ano = calendario.get(Calendar.YEAR);
            int c_mes = calendario.get(Calendar.MONTH);

            if(ano == c_ano && mes == c_mes)
            {
                soma += c.valorTotal();
            }
        }

        return soma;
    }




}
