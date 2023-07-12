package Q4;


interface Drawable {
    void draw();
}

// Circle class implementing the Drawable interface
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Rectangle class implementing the Drawable interface
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class to test the implementation
public class Application4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw(); // Output: Drawing a circle
        rectangle.draw(); // Output: Drawing a rectangle
    }
}
