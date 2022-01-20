import java.util.Scanner;

public class Pro5_64010726 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer from 1 to 15
        System.out.print("Enter the number of lines: ");
        int num_lines = input.nextInt();

        // Display pyramid

        for (int rows = 1; rows <= num_lines; rows++) {
            // Create spaces in each row
            for (int blank = num_lines - rows; blank >= 1; blank--) {
                System.out.print("  ");
            }
            // Create decending numbers in each row
            for (int j = rows; j >= 2; j--) {
                System.out.print(j + " ");
            }
            // Create ascending number in each row
            for (int r = 1; r <= rows; r++) {
                System.out.print(r + " ");
            }
            // End line
            System.out.println();
        }
    }
}
