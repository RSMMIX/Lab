import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Pro4_64010726 {
    public static void main(String[] args) {
        double assistant = 0, associate = 0, full = 0;
        int assistantcount = 0, associatecount = 0, fullcount = 0;

        File file = new File("Salary.txt");
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String[] data = input.nextLine().split(" ");
                if (data[2].equals("assistant")) {
                    assistantcount++;
                    assistant += Double.parseDouble(data[3]);
                } else if (data[2].equals("associate")) {
                    associatecount++;
                    associate += Double.parseDouble(data[3]);
                } else if (data[2].equals("full")) {
                    fullcount++;
                    full += Double.parseDouble(data[3]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        System.out.printf("Total salary for assistant professor is %,.2f\n", assistant);
        System.out.printf("Total salary for associate professor is %,.2f\n", associate);
        System.out.printf("Total salary for full professor is %,.2f\n", full);
        System.out.printf("Total salary for all professors is %,.2f\n", assistant + associate + full);

        System.out.printf("Average salary for assistant professor is %,.2f\n", assistant / assistantcount);
        System.out.printf("Average salary for associate professor is %,.2f\n", associate / associatecount);
        System.out.printf("Average salary for full professor is %,.2f\n", full / fullcount );
        System.out.printf("Average salary for all professors is %,.2f\n", (assistant + associate + full) / (assistantcount + associatecount + fullcount));
    }
}