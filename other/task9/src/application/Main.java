package application;

import circle.Circle;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(2.3);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(17);
        
        System.out.println("Area of circle1 = " + circle1.areaOfCircle(circle1.getRadius()));
        System.out.println("Length of circle1 = " + circle1.lengthOfCircle(circle1.getRadius()));

        System.out.println("Area of circle2 = " + circle2.areaOfCircle(circle2.getRadius()));
        System.out.println("Length of circle2 = " + circle2.lengthOfCircle(circle2.getRadius()));

        System.out.println("Area of circle3 = " + circle3.areaOfCircle(circle3.getRadius()));
        System.out.println("Length of circle3 = " + circle3.lengthOfCircle(circle3.getRadius()));
    }
}
