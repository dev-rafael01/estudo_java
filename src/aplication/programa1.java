package aplication;
import java.util.Scanner;
import java.util.Locale;
import entities.Retangulo;


public class programa1 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();


        System.out.println("Digite a Largura");
        retangulo.largura = sc.nextDouble();

        System.out.println("Digite a Altura ");
        retangulo.altura = sc.nextDouble();

       System.out.println("Sua area é: " + String.format( "%.2f", retangulo.area()));
       System.out.println("Seu perimetro é: " + String.format( "%.2f" , retangulo.perimetro()));
       System.out.println("Seu diagonal é : " + String.format( "%.2f" , retangulo.diagonal()));
        
        

    }
    
}
