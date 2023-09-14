package ua.hillel.dolhykh.homeworks.homework3.variant2;

class Square implements ShapeArea {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}