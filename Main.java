package Shapes1;

public class Main {
    public static void main(String[]args){
        //Out Put The Area and Circumference of the circle and Test if both works
        Circle c= new Circle();
        System.out.println(">>Circle<<");
        c.setRadius(5);
        System.out.println("Radius is: "+c.getRadius());
        System.out.println("Area: "+c.calculateArea());
        System.out.println("Circumference: "+c.calculateCircumference());
        System.out.println("-------All Circle info------");
        System.out.println(c);
        System.out.println("--------------------------");

        //Out Put The Area and Perimeter of a Rectangle and Test if both works
        Rectangle r= new Rectangle();
        System.out.println(">>Rectangle<<");
        r.setHeight(3);
        r.setWidth(5);
        System.out.println("Height is: "+r.getHeight());
        System.out.println("Width is: "+r.getWidth());
        System.out.println("Area: "+r.calculateArea());
        System.out.println("Perimeter: "+r.calculateCircumference());
        System.out.println("-------All Rectangle info------");
        System.out.println(r);
        System.out.println("--------------------------");
        //Out Put The Area and Perimeter of a Triangle and Test if both works
        Triangle t= new Triangle();
        System.out.println(">>Triangle<<");
        t.setHeight(10);
        t.setBase(10);
        System.out.println("Height: "+t.getHeight());
        System.out.println("Base: "+t.getBase());
        System.out.println("Area: "+t.calculateArea());
        System.out.println("Perimeter: "+t.calculateCircumference());
        System.out.println("-------All Triangle info------");
        System.out.println(t);
    }

}
