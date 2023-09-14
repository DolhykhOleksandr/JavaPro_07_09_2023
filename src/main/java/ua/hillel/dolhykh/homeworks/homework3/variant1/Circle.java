package ua.hillel.dolhykh.homeworks.homework3.variant1;

public class Circle implements ShapeArea{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}