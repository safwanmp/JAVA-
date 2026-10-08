public class Rectangle {
    int length;
    int breadth;

    public Rectangle() {
        this.length = 5;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }

    public int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle defaultRect = new Rectangle();
        Rectangle customRect = new Rectangle(4, 6);
        Rectangle square = new Rectangle(7);
        System.out.println("Default area: " + defaultRect.area());
        System.out.println("Custom area: " + customRect.area());
        System.out.println("Square area: " + square.area());
    }
}
