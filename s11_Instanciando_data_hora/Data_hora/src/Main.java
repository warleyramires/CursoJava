import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    public static void main(String[] args){
        //Instanciação de Data-Hora
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-09-17");
        LocalDateTime d05 = LocalDateTime.parse("2022-09-17T01:30:25");
        Instant d06 = Instant.parse("2023-09-15T01:03:45Z");
        Instant d07 = Instant.parse("2023-09-15T01:03:45-03:00");
        LocalDate d08 = LocalDate.parse("29/09/2023", fmt1);
        LocalDate d09 = LocalDate.parse("29/09/2023 17:34", fmt2);
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7,20, 1,30);

        System.out.println("d01: " + d01.toString());
        System.out.println("d02: " + d02.toString());
        System.out.println("d03: " + d03.toString());
        System.out.println("d04: " + d04.toString());
        System.out.println("d05: " + d05.toString());
        System.out.println("d06: " + d06.toString());
        System.out.println("d07: " + d07.toString());
        System.out.println("d08: " + d08.toString());
        System.out.println("d09: " + d09.toString());
        System.out.println("d10: " + d10.toString());
        System.out.println("d11: " + d11.toString());

    }
}