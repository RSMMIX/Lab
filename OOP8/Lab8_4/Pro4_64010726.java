public class Pro4_64010726 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon oc1 = new Octagon(5);

        System.out.println("Area: " + oc1.getArea() + "\nPerimeter: " + oc1.getPerimeter());

        Octagon oc2 = oc1.clone();
        System.out.println("Comparable: " + oc1.compareTo(oc2));
    }
}