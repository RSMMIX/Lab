public class Triangle extends GeometricObject {
    private double[] sides = { 1, 1, 1 };

    public Triangle() {

    }

    public Triangle(double a, double b, double c) {
        sides = new double[] { a, b, c };
    }

    public double getSides(int i) {
        return this.sides[i];
    }

    public void setSides(double[] sides) {
        this.sides = sides;
    }

    public void setSides(double a, double b, double c) {
        sides = new double[] { a, b, c };
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    }

    @Override
    public double getPerimeter() {
        return sides[0] + sides[1] + sides[2];
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}