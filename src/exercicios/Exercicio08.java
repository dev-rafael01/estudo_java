package exercicios;
import java.util.Locale;
import java.util.Scanner;



public class Exercicio08 {

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Bem vindo! Quantas pessoas deseja cadastrar hoje: ");
        int numero = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[numero];
        int[] idade = new int[numero];
        String[] telefone = new String[numero];
        String[] estado = new String[numero];


       
        for (int i = 0; i < numero; i ++)
        {   
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            
            System.out.print("Digite seu nome: ");
            nomes[i] = sc.nextLine();
            
            System.out.print("Digite a idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine(); // limpa o Enter

            System.out.print("Digite o telefone: ");
            telefone[i] = sc.nextLine();

            System.out.print("Digite sua cidade: ");
            estado[i] = sc.nextLine();
                 
        }

        int maiorDeIdade = 0;
        String nomesMaiorIdade = "" ;

        for (int i = 0; i < numero; i ++)
        {
            if(idade[i] >= 18)
            {
                maiorDeIdade ++;
                nomesMaiorIdade += nomes[i] + " - " + idade[i] + " Anos\n";
            }
            
        }
        System.out.println(nomesMaiorIdade);
        System.out.print("Total de maiores de idade: " + maiorDeIdade);

        sc.close();
    }
    
}
