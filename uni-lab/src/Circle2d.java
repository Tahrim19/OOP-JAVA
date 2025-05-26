public class Circle2d{
    private double x;
    private double y;
    private int radius;

    // default constructor
    Circle2d(){
        x=0;
        y=0;
        radius=1;
    }

    // parameterized constructor
    Circle2d(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // getters and setters
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }
}