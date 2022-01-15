import java.util.*;
public class Pro3_64010726 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size for the matrix: ");
        int d = input.nextInt();
        int[][] matrix = new int[d][d];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextInt();

            }
        }
    }
}
