package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        logicaEx03 calculo = new logicaEx03();


        System.out.println("Qual Preço do Dolar? ");
        calculo.cotacaoDolar = sc.nextDouble();
        System.out.println("Quantos Dolares voce vai comprar? ");
        calculo.quantidadeDolar = sc.nextDouble();

        System.out.printf("Valor com IOF:  %.2f\n " , calculo.imposto());
        System.out.println("===============================================");

        System.out.printf("Valor sem IOF: %.2f\n " , calculo.converteDolar());

        sc.close();
        
    }
    
}
