import java.util.*;
public class Pro1_64010726 {
    public static void main(String[] args) {
        
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index: ");

        int index = input.nextInt();
        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds.");
        }
        input.close();
    }
    
}