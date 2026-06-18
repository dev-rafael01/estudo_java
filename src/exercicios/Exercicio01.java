package exercicios;
import java.util.Locale;
import java.util.Scanner;
import exercicios.logicaEx01;


public class Exercicio01 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        logicaEx01 dados =  new logicaEx01();

        System.out.println("Qual seu nome? ");
        dados.nome = sc.nextLine();

        System.out.println("Qual e o seu salario? ");
        dados.salarioBruto = sc.nextDouble();

        System.out.print("Taxa ");
        dados.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario " + dados.nome);
        System.out.println(" ====================== ");
        System.out.println("Qual a porcentagem pro aumento de salario? ");
        double porcentagem = sc.nextDouble();
        dados.aumentoSalario(porcentagem);

        System.out.println(" ====================== ");
        System.out.println("Salario Atualizado " + dados);

       



        
        


       sc.close();
    }
    
}
