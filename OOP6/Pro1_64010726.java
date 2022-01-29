import java.util.*;
import java.util.jar.Attributes.Name;

public class Pro1_64010726 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter weight in pound: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        BMI category = new BMI(name , age , weight , 0 , height);
        System.out.println("BMI is: "+ category.getBMI());
        System.out.print("Status: "+category.getStatus());
    }
}

class BMI {

    private String name;

    private int age;

    private double weight; // in pounds

    private double height; // in inches

    public static final double KILOGRAMS_PER_POUND = 0.45359237;

    public static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double feet, double inches) {

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = feet * 12 + inches;
    }

    public double getBMI() {
        double bmi = (weight * KILOGRAMS_PER_POUND) / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return bmi;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getheight() {
        return height;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}