class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class RectangleShape extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s = new RectangleShape();
        s.draw();
    }
}
