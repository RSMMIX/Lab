public class Pro2_64010726 {
    public static void main(String[] args) {
        
        try {
            System.out.println(new Triangle(1,2,3));
        } catch (IllegalTriangleException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}