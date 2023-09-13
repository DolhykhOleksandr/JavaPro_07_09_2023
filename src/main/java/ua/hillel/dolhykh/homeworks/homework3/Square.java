package ua.hillel.dolhykh.homeworks.homework3;

public class Square implements ShapeArea {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }
}