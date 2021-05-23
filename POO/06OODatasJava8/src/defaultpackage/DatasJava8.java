/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author EDYA
 */
public class DatasJava8 {
    public static void main (String args[]) {
        
        //method1();
        //method2();
        //method3();
        //method4();
        
        //method5();
        //method6();
        //method7();
        //method8();
        
        //method9();
        //method10();
        //method11();
        //method12();
                
        //method13();
        //method14();
        //method15();
       //method16();
        
        method17();
        method18();

    
    }
    
    private static void method1() {
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        
    }
    
    private static void method2() {
        LocalDate hoje = LocalDate.of(1990, Month.NOVEMBER, 21).plusDays(100);
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
    private static void method3() {
        LocalDate hoje = LocalDate.of(1990, Month.NOVEMBER, 21).plusDays(2);
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        LocalDate hoje2 = LocalDate.of(1990, Month.NOVEMBER, 21).plusMonths(2);
        System.out.println(hoje2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        LocalDate hoje3 = LocalDate.of(1990, Month.NOVEMBER, 21).plusYears(2);
        System.out.println(hoje3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
    private static void method4() {
        LocalDate hoje = LocalDate.of(1990, Month.NOVEMBER, 21).minusDays(2);
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        LocalDate hoje2 = LocalDate.of(1990, Month.NOVEMBER, 21).minusMonths(2);
        System.out.println(hoje2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        LocalDate hoje3 = LocalDate.of(1990, Month.NOVEMBER, 21).minusYears(2);
        System.out.println(hoje3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    
    private static void method5() {
        LocalTime hoje = LocalTime.now();
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("HH__mm__ss")));
    }
    
    private static void method6() {
        LocalTime hoje = LocalTime.of(12, 25);
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
    
    private static void method7() {
        LocalTime hoje = LocalTime.of(12, 25).plusHours(2);
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        
        LocalTime hoje2 = LocalTime.of(12, 25).plusMinutes(10);
        System.out.println(hoje2.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        
        LocalTime hoje3 = LocalTime.of(12, 25).plusSeconds(2);
        System.out.println(hoje3.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
    
    private static void method8() {
        LocalTime hoje = LocalTime.of(12, 25).minusHours(2);
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        
        LocalTime hoje2 = LocalTime.of(12, 25).minusMinutes(10);
        System.out.println(hoje2.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        
        LocalTime hoje3 = LocalTime.of(12, 25).minusSeconds(2);
        System.out.println(hoje3.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
    
    private static void method9() {
        LocalDateTime hoje = LocalDateTime.now();
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("\n\n");
    }
    
    private static void method10() {
        //cuidado
        LocalDateTime hoje = LocalDate.now().atTime(12,0);
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("\n\n");
        
        //cuidado
        LocalDateTime hoje1 = LocalTime.now().atDate(hoje.toLocalDate());
        System.out.println(hoje1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("\n\n");

        //cuidado
        LocalTime agora = LocalTime.now();
        LocalDate hoje2 = LocalDate.now();
        LocalDateTime dataEhora = hoje2.atTime(agora);
        System.out.println(dataEhora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("\n\n");
        
        //cuidado
        LocalDateTime dateTime = LocalDateTime.of(2014, 12, 25, 10, 30);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("\n\n");
    }
    
    private static void method11() {
        LocalDateTime hoje = LocalDateTime.now().plusDays(2);
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        
        LocalDateTime hoje2 = LocalDateTime.now().minusWeeks(2);
        System.out.println(hoje2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        
        LocalDateTime hoje3 = LocalDateTime.now().withHour(22);
        System.out.println(hoje3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        
        int dayOFMonth = LocalDateTime.now().getDayOfMonth();
        System.out.println("Day of month: "+ dayOFMonth);
        
        LocalDateTime hoje5 = LocalDateTime.now().withYear(1800);
        System.out.println(hoje5.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        
        System.out.println("\n\n");
    }
    private static void method12() {
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = LocalDate.now().plusDays(1);
        
        System.out.println(hoje.isBefore(amanha));
        System.out.println(hoje.isAfter(amanha));
        System.out.println(hoje.isEqual(amanha));
        System.out.println("\n\n");
    }

    private static void method13() {
        MonthDay hoje = MonthDay.now();
        System.out.println(hoje);
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("MM/dd")));
        System.out.println("\n");
        
        Year ano = Year.now();
        System.out.println(ano);
        System.out.println(ano.format(DateTimeFormatter.ofPattern("yyyy")));
        System.out.println("\n");
        
        YearMonth yearMonth = YearMonth.now().minusMonths(2);
        System.out.println(yearMonth);
        System.out.println(yearMonth.format(DateTimeFormatter.ofPattern("yyyy/MM")));
    }

    private static void method14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a data do seu nascimento");
        String nascimento = scanner.nextLine();
        
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthday = LocalDate.parse(nascimento,dtf);
        
        System.out.println("Data de nascimento:" + birthday.format(dtf));
    }

    private static void method15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o horário de início da aula");
        String nascimento = scanner.nextLine();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime birthday = LocalTime.parse(nascimento,dtf);
        
        System.out.println("Hora de início da aula:" + birthday.format(dtf));
    }

    private static void method16() {
        LocalDate agora = LocalDate.now();
        LocalDate outraData = LocalDate.of(1994, Month.NOVEMBER, 21);

        long dias = ChronoUnit.DAYS.between(agora, outraData);
        long meses = ChronoUnit.MONTHS.between(outraData, agora);
        long anos = ChronoUnit.YEARS.between(outraData, agora);
        
        System.out.printf("%s dias, %s meses e %s anos\n", dias, meses, anos);
    }
    
    private static void method17() {
        LocalDate agora = LocalDate.now();
        LocalDate outraData = LocalDate.now().plusWeeks(1);
        
        Period periodo = Period.between(outraData, agora);
        
        System.out.printf("%s dias, %s meses e %s anos\n",
        periodo.getDays(), periodo.getMonths(), periodo.getYears());
    }
    
    private static void method18() {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime outraData = LocalDateTime.now().plusDays(4);
        
        Duration duration = Duration.between(agora, outraData);
        
        System.out.println("Duration in hours: " + duration.toHours());
    }
}
