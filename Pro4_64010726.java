import java.util.Scanner;

class Pro4_64010726 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble()*0.45359237; 
        System.out.print("Enter height in inches: ");
        double height = scanner.nextDouble()*0.0254; //3.81
        System.out.println("BMI is "+ weight/(height * height));
        scanner.close();
    }
}
