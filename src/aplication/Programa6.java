package aplication;
import java.util.Locale;
import java.util.Scanner;

import entities.aluguel;



public class Programa6 {

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
    
        aluguel[] vetor = new aluguel[10];

        System.out.println("Quantos quartos serão alugados? ");
        int numero = sc.nextInt();

        String[] nome = new String[numero];
        String[] email = new String[numero];



        for(int i = 0;i < numero; i ++)
        {
            System.out.println();
            System.out.println("aluguel #" + (i+1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.print("Email: ");
            email[i] = sc.next();
            System.out.print("Quarto: ");
            int numeroDoQuarto = sc.nextInt();

            vetor[numeroDoQuarto] = new aluguel(nome[i], email[i]);
        }
        System.out.println();
        System.out.println("Quartos Ocupados: ");

        for(int i = 0; i < 10; i ++)
        {
            if(vetor[i]  != null)
            {
                System.out.println(+ i + ": " + vetor[i]);
            }
        }
        

        
    }
    
}
