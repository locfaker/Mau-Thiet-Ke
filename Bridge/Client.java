package Bridge;

public class Client {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueTriangle = new Triangle(new BlueColor());

        redCircle.draw();
        blueTriangle.draw();
    }
}
