package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Programa7 {

    public static void main(String[] args) {
       
        List<String> lista = new ArrayList<>();
        
        lista.add("rafael");
        lista.add("Adriano");
        lista.add("Lethicia");
        lista.add("Beatriz");
        lista.add("Alessandra");

        lista.add(2, "Claudio");

        for(String x : lista)
        {
            System.out.println(x);
        }

        System.out.println("======================================");

        lista.removeIf(x -> x.charAt(0) == 'A');

        for(String x : lista)
        {
            System.out.println(x);
        }

        System.out.println("===================================");

        System.out.println("index of Rafael " + lista.indexOf("rafael"));

        System.out.println("=================================================");

        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'r').collect(Collectors.toList());

        
        for(String x : resultado)
        {
            System.out.println(x);
        }

         System.out.println("===================================");

         String name = lista.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);

         System.out.println(name);


    }
    
}
