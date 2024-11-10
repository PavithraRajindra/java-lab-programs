import java.util.Scanner;

abstract class Shape{
    int a, b;
    abstract void printArea(int x, int y);
}

class Rectangle extends Shape{
    void printArea(int a, int b){
        System.out.println("Area of rectangle is: " + (a*b));
    }
}

class Triangle extends Shape{
    void printArea(int a, int b){
        System.out.println("Area of triangle is: " + (0.5*a*b));
    }
}

class Circle extends Shape{
    void printArea(int a, int b){
        System.out.println("Area of circle is: " + (Math.PI*a*a));
    }
}

public class lab4 {
    public static void main(String[] args) {
        Shape rec = new Rectangle();
        Shape tri = new Triangle();
        Shape cir = new Circle();

        Scanner inp = new Scanner(System.in);
        int choice;
        while(true){
            System.out.print("\nAREA MENU\n1. Rectangle\n2. Triangle\n3. Circle\n4. Exit\nEnter your choice: ");
            choice = inp.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter length and breadth of rectangle: ");
                    rec.printArea(inp.nextInt(), inp.nextInt());
                    break;
                
                case 2:
                    System.out.print("Enter base and height of triangle: ");
                    tri.printArea(inp.nextInt(), inp.nextInt());
                    break;
                
                case 3:
                    System.out.print("Enter radius of circle: ");
                    int x=inp.nextInt();
                    cir.printArea(x, x);
                    break;
                
                case 4:
                    System.out.print("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}