public class Circle {
    private double radius;
    private String color;
    // Constructor
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    // Parameterized constructor
    public Circle(double rad){
        radius = rad;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
