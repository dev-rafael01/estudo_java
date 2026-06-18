package aplication;

import java.util.Scanner;
import java.util.Locale;
import entities.Triangulo;

public class programa2 {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Triangulo x , y ;
        x = new Triangulo();
        y = new Triangulo();




        System.out.println("Quais as medidas do Triangulo X? ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Quais as medidas do Triangulo Y ? ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        
        double areaX =  x.area();
        double areaY = y.area();

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
