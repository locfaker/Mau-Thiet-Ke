package Bridge;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Draw triangle");
        color.fillColor();
    }
}
