package exercicios;
import java.util.Locale;
import java.util.Scanner;


public class Exercicio05 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int inteiro = sc.nextInt();

        int[] vetor = new int[inteiro];

        for (int i = 0; i < inteiro; i ++)
        {   
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
          
        }

        for( int i = 0; i < inteiro; i ++)
        {
            if(vetor[i] < 0)
            {
                System.out.println("Numeros negativos são: " +  vetor[i]);
            }
        }
       

        
    }
    
}
