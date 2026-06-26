package exercicios;
import java.util.Locale;
import java.util.Scanner;


public class Exercicio07 {

     public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantas pessoas seram digitadas? ");
        int numero = sc.nextInt();

        
 
        String[] nomes = new String[numero];
        int[] idade = new int[numero];
        double[] altura = new double[numero];


        for (int i = 0; i < numero; i ++)
        {      
            System.out.printf("Dados da %da pessoa:\n ", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
                   }

         int numerosMenos = 0;
         double alturaTotal = 0;
         double alturaMedia = 0;
         double porcentagemMenores = 0;

         for (int i = 0; i < numero; i++)
         {
            if(idade[i] < 16)
            {
                numerosMenos++;
            }
            alturaTotal = alturaTotal + altura[i];
         }
         alturaMedia = alturaTotal / numero;
         porcentagemMenores = ((double)numerosMenos / numero) * 100.0;



         System.out.printf("\nAltura media = %.2f\n", alturaMedia);
         System.out.printf("Pessoas com menos de 16 anos: %.1f\n ", porcentagemMenores);

         for( int i = 0; i < numero; i ++)
         {
            if (idade[i] < 16)
            {
                System.out.printf("%s\n ", nomes[i]);
            }
         }
        


        sc.close();

     }
}
