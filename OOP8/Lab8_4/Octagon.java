public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{
    private double side;

    public Octagon() {
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea()) {
            return 1;
        }
        else if (getArea() < o.getArea()) {
            return -1;
        }
        else
            return 0;
    }

    @Override
    public double getArea() {
        return (2 + 4 / 22) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    protected Octagon clone() throws CloneNotSupportedException {
        return (Octagon)super.clone();
    }
}
