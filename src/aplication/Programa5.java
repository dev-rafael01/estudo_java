package aplication;
import java.util.Locale;
import java.util.Scanner;

import entities.produtoVetor;

public class Programa5 {
    
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
         produtoVetor[] vetor = new produtoVetor[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Digite o nome do produto");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o valor do produto");
            double valor = sc.nextDouble();

            vetor[i] = new produtoVetor(nome, valor);
            
        }
            double soma = 0.0;
            for (int i = 0; i < n; i ++)
            {
                soma += vetor[i].getValor();
            }
            double media = soma / n;

             System.out.printf("A media dos valores é: " +
              String.format("%.2f ", media));

        sc.close();
    
    }


}
