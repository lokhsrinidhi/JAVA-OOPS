import java.util.Scanner;
abstract class Shape {
    int a, b;
    abstract void printArea();
}
class Rectangle extends Shape {
    Rectangle(int x, int y) {
        a = x;
        b = y;
    }

    void printArea() {
        
        System.out.println("Area of rectangle: " + (a * b));
    }
}
class Triangle extends Shape {
    Triangle(int x, int y) {
        a = x;
        b = y;
    }

    void printArea() {
        System.out.println("Area of triangle: " + (0.5 * a * b));
    }
}
class Circle extends Shape {
    Circle(int r) {
        a = r;
    }

    void printArea() {
        System.out.println("Area of circle: " + (3.14159 * a * a));
    }
}
public class shapee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter length and breadth of rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Shape rect = new Rectangle(l, b);

        System.out.println("Enter base and height of triangle:");
        int base = sc.nextInt();
        int height = sc.nextInt();
     
        Shape tri = new Triangle(base, height); 

        System.out.println("Enter radius of circle:");
        int r = sc.nextInt();
        Shape cir = new Circle(r);

        rect.printArea();
        tri.printArea();
   
        cir.printArea(); 
        
        sc.close();
    }
}

