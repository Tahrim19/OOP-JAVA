
/*
Design a class named MyPoint to represent a point with x and y-coordinates. The class contains:
- The data fields x and y that represent the coordinates with getter methods.
- A no-arg constructor that creates a point (0, 0).
- A constructor that constructs a point with specified coordinates.
- A method named distance that returns the distance from this point to a specified point of the MyPoint type
- A method named distance that returns the distance from this point to another point with specified x- and y- coordinates.

Draw the UML diagram for the class and then implement the class.
Write a test program that creates the two points (0, 0) and (10, 30.5) and displays the distance between them.
*/
class MyPoint {
    // Distance to another MyPoint
    public double distance(MyPoint p) {
        return distance(p.getX(), p.getY());
    }

    // Distance to specified coordinates
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    private double x;
    private double y;
    MyPoint(){
        setX(0);
        setY(0);
    }
    MyPoint(double x,double y){
        setX(x);
        setY(y);
    }
    // getters and setters for x and y
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}

public class Main {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println("Distance between (0,0) and (10, 30.5): " + p1.distance(p2));
    }
}