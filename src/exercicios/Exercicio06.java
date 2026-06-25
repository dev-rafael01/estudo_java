package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int inteiro = sc.nextInt();

        int[] vetor = new int[inteiro];

        for(int i = 0; i < inteiro; i ++)
        {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        double soma = 0;
        

        System.out.print("Valores: ");
        for(int i = 0; i < inteiro; i ++)
        {
            System.out.print(vetor[i] + " ");
            soma += vetor[i];
        }

         double media = soma / inteiro;

         System.out.println();
         System.out.println("Soma = " + soma);
         System.out.println("Media: " + media);

       

        


        sc.close();
    }
    
}
