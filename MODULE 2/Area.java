public class Area {
    public double calculateArea(double side) {
        return side * side;
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public double calculateArea(double radius, double height, boolean isCircle) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Square: " + area.calculateArea(5));
        System.out.println("Rectangle: " + area.calculateArea(4, 6));
        System.out.println("Circle: " + area.calculateArea(3, 0, true));
    }
}
