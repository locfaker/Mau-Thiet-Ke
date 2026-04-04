package Decorator;

public abstract class ComponentWithRedBorder implements Component {
    private Component component;

    public ComponentWithRedBorder(Component component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw();
    }

    protected void drawRedBorder() {
        System.out.println("Draw red border");
    }
}
