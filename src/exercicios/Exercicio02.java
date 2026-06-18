package exercicios;
import java.util.Locale;
import java.util.Scanner;
import exercicios.logicaEx02;


public class Exercicio02 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        logicaEx02 dados1 = new logicaEx02();

        System.out.println("Informe seu nome ");
        dados1.nome = sc.nextLine();

        System.out.println("Informe suas notas abaixo: ");
        System.out.print("Primeiro Semestre: ");
        dados1.n1 = sc.nextDouble();
        System.out.print("Segundo Semestre: ");
        dados1.n2 = sc.nextDouble();
        System.out.print("Terceiro Semestre: ");
        dados1.n3 = sc.nextDouble();


        System.out.println("============================");
        System.out.println( dados1.toString() );
        dados1.estudante();





        
       



        
        


       sc.close();
    }
    
}
