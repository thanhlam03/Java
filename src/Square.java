package baiabstract9Shape;
public class Square extends Shape {
    private double side;

    public Square() {
        super();
        this.side = 1.0;
    }
    public Square(double side) {
        super();
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square with side = " + side + ", which is a subclass of " + super.toString();
    }
}
