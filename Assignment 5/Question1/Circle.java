public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center,double radius){
        this.center = center;
        this.radius = radius;
    }
    public double AreaOfCircle(){
        return Math.PI * radius * radius;
    }
    void display(){
        System.out.println("Circle center: (" + center.getX() + ", " + center.getY() + ")");
        System.out.println("Radius of Circle: "+radius);
        System.out.println("Area of Circle: "+AreaOfCircle());
    }
}
