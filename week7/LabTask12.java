import java.util.Scanner;

public class LabTask12 {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the year
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        // Prompt the user to enter the month
        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();

        // Print the calendar for the given month and year
        printMonth(year, month);

        // Close the scanner
        input.close();
    }

    // Method to print the month
    public static void printMonth(int year, int month) {
        // Print the header
        printMonthTitle(year, month);

        // Print the body of the calendar
        printMonthBody(year, month);
    }

    // Method to print the month title
    public static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }

    // Method to print the body of the month
    public static void printMonthBody(int year, int month) {
        // Get the start day of the month
        int startDay = getStartDay(year, month);

        // Get the number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        // Pad space for the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0) {
                System.out.println();  // Start a new line after Saturday
            }
        }
        System.out.println();
    }

    // Method to get the start day of the month
    public static int getStartDay(int year, int month) {
        // Jan 1, 1800 was a Wednesday (start day = 3)
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    // Method to get the total number of days since 1/1/1800 to the specified year and month
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        // Get the total days from 1800 to the year before the current year
        for (int i = 1800; i < year; i++) {
            if (isLeapYear(i)) {
                total += 366;
            } else {
                total += 365;
            }
        }

        // Add days from January to the month before the current month
        for (int i = 1; i < month; i++) {
            total += getNumberOfDaysInMonth(year, i);
        }

        return total;
    }

    // Method to get the number of days in a month
    public static int getNumberOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1: return 31;
            case 2: return isLeapYear(year) ? 29 : 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;  // Invalid month
        }
    }

    // Method to determine if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}
