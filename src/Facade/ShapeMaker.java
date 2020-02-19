package Facade;

public class ShapeMaker {
    Shape circle;
    Shape triangle;

    public ShapeMaker() {
        circle = new Circle();
        triangle = new Triangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }
}
