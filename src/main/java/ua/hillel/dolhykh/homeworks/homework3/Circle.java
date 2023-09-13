package ua.hillel.dolhykh.homeworks.homework3;

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