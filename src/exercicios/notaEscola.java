package aplication;
import java.util.Locale;
import java.util.Scanner;

public class notaEscola {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" ===> Bem vindo ao sistema de nota da escola E.E Simon Bolivar  <====");
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        System.out.print("Digite sua Serie: ");
        String serie = sc.next();

        System.out.println("Ola " + nome + " Voce esta no(a): "  + serie + " Ano Perfeito, vamos começar: ");

        System.out.print("Digite sua Primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.print("Digite sua Segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.print("Digite sua Terceira nota: ");
        int nota3 = sc.nextInt();
        System.out.print("Digite sua Quarta nota: ");
        int nota4 = sc.nextInt();
        System.out.print("Digite sua Quinta nota: ");
        int nota5 = sc.nextInt();
        System.out.print("Digite sua Sexta nota: ");
        int nota6 = sc.nextInt();

        int soma = 0;
        soma = nota1 + nota2 + nota3 + nota4 + nota5 + nota6;
        double media = soma / 6.0;

        if(media > 7)
        {
            System.out.print("Parabens " + nome + " Voce esta aprovado, sua média é: " + media );
        }else if(media >= 5 && media <= 6)
        {
            System.out.print(nome + " Voce esta de recuperação. sua média é: " + media );
        }else{
            System.out.print(nome +" infelizmente voce esta reprovado, sua média é: " + media );
        }      

        sc.close();
    }
    
}
