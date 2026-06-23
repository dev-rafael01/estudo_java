/*

*/

package exercicios;
import exercicios.logicaEX04;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {


    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Bem-Vindo");
        System.out.print("Numero da Conta: ");
        int numero = sc.nextInt();
        System.out.print("Nome do titular: ");
        sc.nextLine();
        String nome = sc.nextLine();
       

        System.out.print("Tem deposito inicial? (S/N):  ");
        char resposta = sc.next().charAt(0);

        logicaEX04 conta;

        if(resposta == 's' || resposta ==  'S')
        {
            System.out.println("Valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta =  new logicaEX04(nome, numero, depositoInicial);
        }else{
            conta = new logicaEX04(nome, numero);
        }

        System.out.println();
        System.out.println("Dados da Conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Deposite um novo valor: ");
        double depositoNovo = sc.nextDouble();
        conta.Deposito(depositoNovo);
        System.out.println("Novo deposito realizado: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Realize um saque: ");
        double novosaque = sc.nextDouble();
        conta.Sacar(novosaque);
        System.out.println("Saque realizado com sucesso ");
        System.out.print(conta);

        


        sc.close();    

    }
    
}
