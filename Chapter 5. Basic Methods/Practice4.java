/**
 * Practice2
 * An simple program to calculate the area of a triangle and a circle
 */
public class Practice4 {

    public static void main(String[] args) {
        double triangleArea = calcTriangleArea(10.0, 5.0);
        double circleArea = calcCircleArea(5.0);

        System.out.println(triangleArea + " " + circleArea);
    }

    public static double calcTriangleArea(double height, double bottom) {
        return height * bottom / 2;
    }

    public static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }
}