public class SecondCircle {
    private double radius;

    // constructor-1
    public SecondCircle(){
        radius = 1.0;
    }

    // constructor-2
    public SecondCircle(double rad){
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
       return "Circle[radius = "+radius+"]";
    }
}
