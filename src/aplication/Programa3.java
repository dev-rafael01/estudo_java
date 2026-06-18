package aplication;
import java.util.Locale;
import java.util.Scanner;

import entities.Calculador;

public class Programa3 {

    

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("qual tamanho do raio? ");
        double radius = sc.nextDouble();
        // Calculador calc = new Calculador();

        double c = Calculador.circuferencia(radius);

        double v = Calculador.volume(radius);

        System.out.printf("Circuferencia: %.2f\n" , + c);
        System.out.printf("Volume: %.2f\n" , + v);
        System.out.printf("PI volume: %.2f\n" , Calculador.PI);


        sc.close();
    }

  
    
}
