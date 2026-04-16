package Shapes1;

public class Main {
    public static void main(String[]args){
       Circle c= new Circle();
        //Out Put The Area and Circumference of the circle and Test if both works
        c.setRadius(5);
        System.out.println(c);

        //Out Put The Area and Perimeter of a Rectangle and Test if both works
        Rectangle r= new Rectangle();
        r.setHeight(3);
        r.setWidth(5);
        System.out.println(r);
        //Out Put The Area and Perimeter of a Triangle and Test if both works
        Triangle t= new Triangle();
        t.setHeight(10);
        t.setBase(10);
        System.out.println(t);
    }

}
