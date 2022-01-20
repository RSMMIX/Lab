import java.util.Scanner;

public class Pro3_64010726 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month 1-12: ");
        int m = input.nextInt();

        System.out.print("Enter day 1-31: ");
        int q = input.nextInt(); // q is the day of the month.
        String[] day_of_week = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
        if (m == 1 || m == 2) {
            m += 12;
            year--;
        }
        int j = year / 100;
        int k = year % 100;
        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        System.out.println(day_of_week[h]);
    }
}
