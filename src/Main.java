import Shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle();

        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        System.out.println(circle3.getArea());
        System.out.println(circle1.getRadius());
    }
}
