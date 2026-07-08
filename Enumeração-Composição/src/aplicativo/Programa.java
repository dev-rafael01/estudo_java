package aplicativo;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.level;
import entities.nivelTrabalho;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual nome do Departamento? ");
        String departamento = sc.next();
        System.out.println("Insira dados do trabalhador: ");
        System.out.print("Nome: ");
        String dadosTrabalhador = sc.nextLine();
        System.out.print("nivel do trabalhador: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Salario Base: ");
        double salarioBase = sc.nextDouble();

        level leveltrabalhador = new level(dadosTrabalhador, nivelTrabalho.valueOf(nivelTrabalhador), salarioBase, new Departamento(departamento));

        System.out.print("Quantos contratos este trabalhador tem? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i ++)
        {
            System.out.println("inserir dados #" + i + " Do Contrato:");
            System.out.print("Entra com data: (DD/MM/YYYY)");
        }

        
        
    }
    
}
