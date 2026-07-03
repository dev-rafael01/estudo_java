package aplication;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Instant;



public class Programa8 {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2026-07-03");
        LocalDate d05 = LocalDate.parse("03/07/2026", fmt1);
        LocalDate d06 = LocalDate.of(2026, 7, 03);
        LocalDateTime d07 = LocalDateTime.of(2026, 7, 03, 7, 37);



        System.out.println("Dia atual: " + d01);
        System.out.println("data e hora: " + d02);
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d06: " + d06);
        System.out.println("d07: " + d07);
        System.out.println("Data Br: " + d04.format(fmt1));
        // System.out.println("Data Br: " + d04.from(fmt1));
    }
    
}
