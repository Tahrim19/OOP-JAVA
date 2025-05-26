/*
Assume a `Point2D` class is already created with two double data fields `x` and `y`.
- One of its constructors, `Point2D(double x, double y)`, creates a point with the specified coordinate values `x` and `y`.
Now, define a class named `Circle2D` that contains the following:
- two double data fields named `x` and `y` that specify the center of the circle, and one integer data field named `radius`, all with appropriate getter methods.
- The class should include a no-argument constructor that creates a default circle with center at (0, 0) and radius 1, and another constructor that accepts values
  for `x`, `y`, and `radius` to create a circle with specified parameters. Additionally, the class must have a method `getArea()`
  that returns the area of the circle and a method `getCircumference()` that returns the circumference of the circle.

Next, write a `Geometry` class that defines a static method named `pointCircleRelation`.
This method should take a `Circle2D` object and a `Point2D` object as input parameters, and determine whether the point lies inside the circle, on the circle, or outside the circle.
It should then print the appropriate message based on the location of the point relative to the circle.

Finally, write a `Test` class with a `main` method. In this method, take input from the user for the center coordinates and
radius of the circle, and use these to create a `Circle2D` object. Then, take input for the coordinates of a point, create a `Point2D` object,
and call the `pointCircleRelation` method from the `Geometry` class to print whether the point lies inside, on, or outside the circle.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get x , y and radius as user input for circle
        System.out.println("Enter circle center x");
        double cx = input.nextDouble();
        System.out.println("Enter circle center y");
        double cy = input.nextDouble();
        System.out.println("Enter circle radius");
        int radius = input.nextInt();
        Circle2d circle = new Circle2d(cx,cy,radius);

        System.out.println("Area of circle: "+circle.getArea());
        System.out.println("Circumference of circle: "+circle.getCircumference());

        // get x and y for point as user input
        System.out.println("Enter point x");
        double px = input.nextDouble();
        System.out.println("Enter point y");
        double py = input.nextDouble();
        Point2d point = new Point2d(px,py);

        Geometry.PointCircleRelation(circle,point);
    }

}
