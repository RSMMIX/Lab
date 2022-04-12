import java.io.FileWriter;
import java.io.IOException;
public class Pro3_64010726 {

    static String[] rank = { " assistant ", " associate ", " full " };

    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("Salary.txt");
            for (int i = 1; i <= 1000; i++) {
                int r = (int) (Math.random() * 3);
                file.write("FirstName" + i + " LastName" + i + rank[r] +  randomSalary(r) + "\n");
            }
            file.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    static double randomSalary(int r) {
        if (r == 0) {
            return (int) ((50000 + (Math.random() * 30000)) * 100) / 100.0;
        } else if (r == 1) {
            return (int) ((60000 + (Math.random() * 50000)) * 100) / 100.0;
        } else if (r == 2) {
            return (int) ((75000 + (Math.random() * 55000)) * 100) / 100.0;
        }
        return r;
    }
}