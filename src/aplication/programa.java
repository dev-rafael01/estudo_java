package aplication;

import java.util.Scanner;
import java.util.Locale;

public class programa {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double xA, xB, xC, yA, yB , yC;

        System.out.println("Quais as medidas do Triangulo X? ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Quais as medidas do Triangulo Y ? ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p  = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA ) *  (p - xB) * (p -xC));

        p = (yA + yB + yC) / 2.00;
        double areaY = Math.sqrt(p * (p - yA ) *  (p - yB) * (p -yC));

        System.out.printf("Triangulo X area: %4f\n", areaX);
        System.out.printf("Triangulo Y area: %4f\n", areaY);


        if (areaX > areaY){
            System.out.println("Tamanho area:  X ");
        }else{
             System.out.println("Tamanho area:  Y ");
        }



        sc.close();

    }
}
