package arrays.medium ;

import java.time.LocalDate;

public class MonthCalculator {
    public static int calculateMonthsBetween(LocalDate date1, LocalDate date2) {
        // Ensure date1 is before date2
        if (date1.isAfter(date2)) {
            LocalDate temp = date1;
            date1 = date2;
            date2 = temp;
        }

        // Calculate the difference in months
        int monthsBetween = (date2.getYear() - date1.getYear()) * 12 + (date2.getMonthValue() - date1.getMonthValue());

        // Adjust for the days of the month
        if (date2.getDayOfMonth() < date1.getDayOfMonth()) {
            monthsBetween--;
        }

        return monthsBetween;
    }

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2025, 02, 28);
        LocalDate date2 = LocalDate.of(2026, 04, 03);
        System.out.println(calculateMonthsBetween(date1, date2)); // Output: 13

        LocalDate date3 = LocalDate.of(2026, 1, 1);
        LocalDate date4 = LocalDate.of(2025, 12, 31);
        System.out.println(calculateMonthsBetween(date3, date4)); // Output: 2
    }
}
