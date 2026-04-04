package Decorator;

public class Circle implements Component {
    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
}
