package arrays.medium ;

import java.time.LocalDate;

public class MonthCalculator {
    public static int calculateMonthsBetween(LocalDate date1, LocalDate date2) {
        int yearDiff = date1.getYear() - date2.getYear();
        int monthDiff = date1.getMonthValue() - date2.getMonthValue();
        
        int months = yearDiff * 12 + monthDiff;
        int dayofmonthdate1 = date1.getDayOfMonth();
        int dayofmonthdate2 = date2.getDayOfMonth();
        
        // Adjust if day of date1 is greater than day of date2
        if (dayofmonthdate1 < dayofmonthdate2 && months < 12) {
            months = months + 1;
        }

        return months;
    }

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2028, 12, 1);
        LocalDate date2 = LocalDate.of(2024, 12, 31);
        System.out.println(calculateMonthsBetween(date1, date2)); // Output: 13

        LocalDate date3 = LocalDate.of(2026, 1, 1);
        LocalDate date4 = LocalDate.of(2025, 12, 31);
        System.out.println(calculateMonthsBetween(date3, date4)); // Output: 2
    }
}
