public class Pro2_64010726 {
    public static void main(String[] args) {
        RegularPolygon mypol = new RegularPolygon();
        RegularPolygon polmy = new RegularPolygon(6, 4);
        RegularPolygon olmyp = new RegularPolygon(10 , 4, 5.6, 7.8);
        System.out.println("The perimeter of mypol is "+mypol.getPerimeter());
        System.out.println("The area of mypol is "+mypol.getArea());
        System.out.println("The perimeter of polmy is "+polmy.getPerimeter());
        System.out.println("The area of polmy is "+polmy.getArea());
        System.out.println("The perimeter of olmyp is "+olmyp.getPerimeter());
        System.out.println("The area of olmyp is "+olmyp.getArea());
    }
}

class RegularPolygon {
    private int n = 3; // number of sides of the polygon
    private double side = 1;
    private double x = 0; // x coordinate
    private double y = 0; // y coordinate

    public RegularPolygon() {

    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

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
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }
}
