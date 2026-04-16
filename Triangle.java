package Shapes1;

public class Triangle extends Shape{
    private double height;
    private double base;
public Triangle(){

}
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (base*height)/2;
    }

    @Override
    public double calculateCircumference() {
        return base*3;
    }
    public String toString() {
        return "A Triangle with height: " + getHeight() +" And Base: "+getBase()+
                "\nArea: " + calculateArea() +
                "\nPerimeter: " + calculateCircumference();
    }
}