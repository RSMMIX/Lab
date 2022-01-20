public class Pro2_64010726 {
    public static void main(String[] args) {
        
    }
}

class RegularPolygon {
    private int n; // number of sides of the polygon
    private double side;
    private double x; // x coordinate
    private double y; // y coordinate

    // pubilc RegularPolygon(int n, double side) {
    //     this.n = n;
    //     this.side = side;
    //     x = 0;
    //     y = 0;
    // }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side) * 5;
    }

}
