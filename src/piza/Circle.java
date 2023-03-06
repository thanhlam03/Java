package piza;

public class Circle  implements IShape {
    private double _radius;
    public Circle(double radius) {
        _radius = radius;
    }
    public double getArea()    {
        return Math.PI * _radius * _radius;
    }
    public String toString() {
        return "piza.Circle(radius = " + _radius + ")";
    }
}



