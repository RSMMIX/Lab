public class Square extends GeometricObject implements Colorable{
    
    private double side;

    public Square(){
    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled);
        setSide(side);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + side + "\nArea: " + getArea() + "\ngetPerimeter: " + getPerimeter();
    }

    @Override
    public void howToColor() {
       System.out.println("Color all four side");
    }

    @Override
    public double getArea() {
  
        return side * side;
    }
}
