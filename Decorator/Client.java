package Decorator;

public class Client {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        Component circle1 = new Circle();
        Component circle2 = new CircleWithRedBorder(new Circle());

        canvas.paint(circle1);
        System.out.println("-----");
        canvas.paint(circle2);
    }
}
