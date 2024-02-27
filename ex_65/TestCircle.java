package ex_65;

public class TestCircle {
    public static void main(String[] args) {
        GeometricObject a = new Circle(5.0);
        System.out.println("Dien tich cua hinh tron la : " + a.getArea());
        System.out.println("Chu vi cua hinh tron la : " + a.getPerimeter());
    }
}
