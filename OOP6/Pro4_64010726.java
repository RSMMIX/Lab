import java.util.*;

public class Pro4_64010726 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Filing Status");
        System.out.println("\t[0]-Single filer");
        System.out.println("\t[1]-Married jointly or qualifying widow(er)");
        System.out.println("\t[2]-Married separately");
        System.out.println("\t[3]-Head of household");
        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        System.out.print("Tax is "+ComputeTax(status, income));
    }

    public static double ComputeTax(int s, double income) {
        double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        int[][] brackets = {
                { 8350, 33950, 82250, 171550, 372950 }, // Single filer
                { 16700, 67900, 137050, 20885, 372950 }, // Married jointly or qualifying widow(er)
                { 8350, 33950, 68525, 104425, 186475 }, // Married separately
                { 11950, 45500, 117450, 190200, 372950 } // Head of household
        };
        if (income <= brackets[s][0]) {
            return income * rates[0];
        }
        if (income <= brackets[s][1]) {
            return (brackets[s][0] * rates[0]) + (income - brackets[s][0]) * rates[1];
        }
        if (income <= brackets[s][2]) {
            return (brackets[s][0] * rates[0]) +
                    (brackets[s][1] - brackets[s][0]) * rates[1] +
                    (income - brackets[s][1]) * rates[2];
        }
        if (income <= brackets[s][3]) {
            return (brackets[s][0] * rates[0]) +
                    (brackets[s][1] - brackets[s][0]) * rates[1] +
                    (brackets[s][2] - brackets[s][1]) * rates[2] +
                    (income - brackets[s][2]) * rates[3];
        }
        if (income <= brackets[s][4]){
            return (brackets[s][0] * rates[0]) +
                    (brackets[s][1] - brackets[s][0]) * rates[1] +
                    (brackets[s][2] - brackets[s][1]) * rates[2] +
                    (brackets[s][3] - brackets[s][2]) * rates[3] +
                    (income - brackets[s][3]) * rates[4];
        }
                    
        return (brackets[s][0] * rates[0]) +
                (brackets[s][1] - brackets[s][0]) * rates[1] +
                (brackets[s][2] - brackets[s][1]) * rates[2] +
                (brackets[s][3] - brackets[s][2]) * rates[3] +
                (brackets[s][4] - brackets[s][3]) * rates[4] +
                (income - brackets[s][4]) * rates[5];
    }

}