public class TestShape {
    public static void main(String[] args){
       Shape r1 = new Rectangle(20,30);
        Shape c1 = new Circle(30);
        Shape r2 = new Rectangle(15,25);
        Shape c2 = new Circle(25);

        Shape[] list = {r1,c1,r2,c2};
        for (Shape S : list){
            System.out.println("Dien tich la : " + S.getArea());
        }
    }
}
