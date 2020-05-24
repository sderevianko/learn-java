package circle;

public class Circle {
    
    public static final double PI = 3.1416;
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double areaOfCircle(double radius) {
        return PI * Math.pow(radius, 2);
    }

    public double lengthOfCircle(double radius) {
        return 2 * PI * radius;
    }
}
