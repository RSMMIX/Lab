import java.util.Scanner;

public class Pro1_64010726 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides: ");
        Triangle triangle = new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());

        input.nextLine();

        System.out.println("Enter a color: ");
        triangle.setColor(input.nextLine());

        System.out.println("Is the triangle filled? ");
        triangle.setFilled(input.nextBoolean());

        System.out.println(triangle);

    }
}