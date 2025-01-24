public class Main {
    public static void main(String[] args) {
        // Create a Circle using the default constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1: " + circle1);
        System.out.println("Area of Circle 1: " + circle1.getArea());

        // Create a Circle with a specific radius
        Circle circle2 = new Circle(5.0);
        System.out.println("\nCircle 2: " + circle2);
        System.out.println("Area of Circle 2: " + circle2.getArea());

        // Create a Circle with a specific radius and color
        Circle circle3 = new Circle(3.0, "blue");
        System.out.println("\nCircle 3: " + circle3);
        System.out.println("Area of Circle 3: " + circle3.getArea());

        // Modify Circle 3's properties
        circle3.setRadius(4.0);
        circle3.setColor("green");
        System.out.println("\nUpdated Circle 3: " + circle3);
        System.out.println("Updated Area of Circle 3: " + circle3.getArea());
    }
}
