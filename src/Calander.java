//Calendar Question

import java.time.LocalDate;
import java.util.Scanner;

public class Calander{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take input from user for Month,Day and year
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        //LocalDate is an immutable date-time object that represents a date, often viewed as year-month-day.
        LocalDate dt = LocalDate.of(year, month, day);
        System.out.print(dt.getDayOfWeek());
    }
}