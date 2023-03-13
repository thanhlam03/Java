package baiabstract9Shape;
public class run {
    public static void main(String[] args) {
        Circle c1 = new Circle(8);
        Rectangle r1 = new Rectangle(6,2);
        Square      s1 = new Square(7);
        System.out.println(c1);
        System.out.println(" dien tich la "+c1.getArea()+"\n chu vi la "+c1.getPerimeter());
        System.out.println(r1);
        System.out.println(" dien tich la "+r1.getArea()+"\n chu vi la "+r1.getPerimeter());
        System.out.println(s1);
        System.out.println(" dien tich la "+s1.getArea()+"\n chu vi la "+s1.getPerimeter());
        System.out.println();
    }
}