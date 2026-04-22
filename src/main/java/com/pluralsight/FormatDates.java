package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String format1 = localDateTime.format(formatter1);
        System.out.println(format1);
        System.out.println(localDate);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("E dd, yyyy");
        String format2 = localDateTime.format(formatter2);
        System.out.println(format2);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm");
        String format3 = localDateTime.format(formatter3);
        System.out.println(format3);
    }
}
