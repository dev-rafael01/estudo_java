package aplicativo;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;


import entities.Departamento;
import entities.HoraContrato;
import entities.level;
import entities.nivelTrabalho;

public class Programa {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Qual nome do Departamento? ");
        String departamento = sc.next();
        System.out.println("Insira dados do trabalhador: ");
        System.out.print("Nome: ");
        String dadosTrabalhador = sc.next();
        System.out.print("nivel do trabalhador: ");
        String nivelTrabalhador = sc.next();
        System.out.print("Salario Base: ");
        double salarioBase = sc.nextDouble();

        level leveltrabalhador = new level(dadosTrabalhador, nivelTrabalho.valueOf(nivelTrabalhador), salarioBase, new Departamento(departamento));

        System.out.print("Quantos contratos este trabalhador tem? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++)
        {
            System.out.println("Entre com os dados do contrato #" + i + ":");
            System.out.print("DATA : (DD/MM/YYYY) ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor por hora:  ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração por hora:  ");
            int horas = sc.nextInt();
            HoraContrato contrato = new HoraContrato(contractDate, valorPorHora, horas);
            leveltrabalhador.addContratos(contrato);
        }


        System.out.println();
        System.out.print("Insira o mês e o ano para calcular a renda (MM/AAAA) ");
        String mesEano = sc.next();
        int mes = Integer.parseInt(mesEano.substring(0, 2));
        int ano = Integer.parseInt(mesEano.substring(3));
        System.out.println("Nome: " + leveltrabalhador.getNome());
        System.out.println("Departamento: " + leveltrabalhador.getDepartamento(). getNome());
        System.out.println("Renda do trabalhador(a): " + mesEano + ": " + String.format("%.2f ", leveltrabalhador.renda(mes, ano)));


        
        
    }
    
}
