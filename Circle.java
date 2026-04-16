package Shapes1;

public class Circle extends Shape {
    private double radius;
public Circle(){

}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area;
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double calculateCircumference() {
        double cr = Math.PI * radius * 2;
        return cr;

    }

    public String toString() {
        return "A circle of radius: " + getRadius() +
                "\nArea: " + calculateArea() +
                "\nCircumference: " + calculateCircumference();
    }
}
