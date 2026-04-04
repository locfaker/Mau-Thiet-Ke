package Bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
        color.fillColor();
    }
}
