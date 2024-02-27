package ex_65;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        super.radius *= percent/100.0;
    }

    @Override
    public String toString() {
        return "ResizableCircle[radius=" + radius + "]";
    }
}
