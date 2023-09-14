package ua.hillel.dolhykh.homeworks.homework3.variant2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 6);
        Square square = new Square(5.5);

        double summaryArea = circle.area() + triangle.area() + square.area();
        System.out.format("Summary area of shapes is %.2f\n", summaryArea);
    }
}