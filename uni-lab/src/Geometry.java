public class Geometry {
    public static void PointCircleRelation(Circle2d circle , Point2d point){
        double dx = point.getX() - circle.getX();
        double dy = point.getY() - circle.getY();
        double distance = Math.sqrt(dx*dx + dy*dy);
        int radius = circle.getRadius();

        if(distance < radius){
            System.out.println("Point is inside a circle.");
        }
        else if(distance == radius){
            System.out.println("Point is inside a circle.");
        }
        else{
            System.out.println("Point is outside a circle.");
        }
    }
}
