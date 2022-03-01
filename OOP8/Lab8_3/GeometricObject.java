import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject(){
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }
    
    public boolean getFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }


    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", filled='" + isFilled() + "'" +
            ", dateCreated='" + getDateCreated() + "'" +
            "}";
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}