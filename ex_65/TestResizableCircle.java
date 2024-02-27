package ex_65;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle a = new ResizableCircle(5.0);
        System.out.println("Dien tich cua hinh tron la : " + a.getArea());
        System.out.println("Chu vi cua hinh tron la : " + a.getPerimeter());
        a.resize(150);
        System.out.println("Dien tich cua hinh tron la : " + a.getArea());
        System.out.println("Chu vi cua hinh tron la : " + a.getPerimeter());
    }
}
