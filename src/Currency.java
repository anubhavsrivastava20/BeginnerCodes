//Currency Converter Question

import java.text.NumberFormat;
        import java.util.Locale;
        import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        //Given a Date ( month / Day / year) take user I/P. O/P as Day
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        //Create a new Locale as India is not present
        Locale India = new Locale("en", "IN");

        //Use Numberformat and get currency instance for Currency formatting
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(India).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}