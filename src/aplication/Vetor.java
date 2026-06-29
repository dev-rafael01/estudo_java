package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas seram digitadas: ?");
        int numero = sc.nextInt();

        String[] nomes = new String[numero];
        int[] idade = new int[numero];
        double[] altura = new double[numero];

        for(int i = 0; i < numero; i ++)
        {
            System.out.println("Dados da " + (i + 1) + ": pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Altura ");
            altura[i] = sc.nextDouble();
        }

        double soma = 0.0;
        double mediaAltura = 0.0;

        for(int i = 0; i < numero; i ++)
        {
            soma = soma + altura[i];
        }

        mediaAltura = soma / numero;

        System.out.println();
        System.out.printf("Altura média é: %.2f\n " , mediaAltura);

        int contador = 0;
        double porcentagem = 0.0;

        for (int i = 0;i < numero; i ++)
        {
            if (idade[i] < 16)
            {
                contador += contador +1;
            }
        }

        porcentagem = contador * 100.0 / numero;

        // Foi acrescentado no fim do %.1f dois simbulos de % para poder ser ixibdo como % ao usuario, o 3 simbolo % e pra acrescenta \n pra pular a linha:
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n ", porcentagem);

        for (int i = 0; i < numero; i ++)
        {
            if (idade[i] <= 16)
            {
                System.out.println(nomes[i]);
            }
        }


        



        sc.close();
    }
    
}
