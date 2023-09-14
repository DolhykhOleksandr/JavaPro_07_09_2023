package ua.hillel.dolhykh.homeworks.homework3.variant1;

public class Triangle implements ShapeArea {
    private double h;
    private double a;

    public Triangle(double h, double a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public double area() {
        return 0.5 * a * h;
    }
}