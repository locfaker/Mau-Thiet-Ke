package Decorator;

public class CircleWithRedBorder extends ComponentWithRedBorder {

    public CircleWithRedBorder(Component component) {
        super(component);
    }
    
    @Override
    public void draw() {
        super.draw();
        drawRedBorder();
    }
}
