abstract class Shape{
    abstract void calculateArea();
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    void calculateArea(){
        System.out.println("Area of Rectangle: " + (length * width));
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void calculateArea(){
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}
public class Abstractclass {
    public static void main(String args[]) {
        Shape s = new Rectangle(5.0, 3.0);
        s.calculateArea();
        s = new Circle(4.0);
        s.calculateArea();
    }
}
