package Q2;


abstract class Shape {
    public abstract double calculateArea();
}

// Rectangle class, subclass of Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Circle class, subclass of Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle class, subclass of Shape
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}


class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
    }
}

// Main class to test the implementation
public class Application2 {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(6, 7);
        Circle circle = new Circle(6);
        Triangle triangle = new Triangle(8, 10);

        calculator.printArea(rectangle); // Output: Area: 42.0
        calculator.printArea(circle); // Output: Area: 113.09733552923255
        calculator.printArea(triangle); // Output: 40.0
       
    }
}
