package be.intecbrussel.factorypattern;

public class App {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        //factory.getShape(null);

        Shape circle = factory.getShape("circle");
        circle.draw();

        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();

        Shape square = factory.getShape("square");
        square.draw();
    }
}
