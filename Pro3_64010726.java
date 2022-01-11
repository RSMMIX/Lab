import java.util.Scanner;

class Pro3_64010726 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        System.out.println("The sum of the  digits is " + (number / 1000 + number % 1000 / 100 + number % 100 / 10 + number % 10));
        scanner.close();
    }
}
