package ua.hillel.dolhykh.homeworks.homework3.variant2;

class Circle implements ShapeArea {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}