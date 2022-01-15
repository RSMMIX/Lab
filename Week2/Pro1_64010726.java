package Week2;
import java.util.Scanner;

public class Pro1_64010726 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //(Sunday is 0, Monday is 1, ..., and Saturday is 6)
        System.out.print("Enter today's day: ");
        int date = in.nextInt();

        //prompt the user to enter the number of days after today for a future day and display the future day of the week. 
        System.out.print("Enter the number of days elapsed since today: ");
        int passed = in.nextInt();
        
        int future_date = (date + passed) % 7; 
        String[] day_of_week = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Today is " + day_of_week[date] + " and the future day is " + day_of_week[future_date]);
    }
}
