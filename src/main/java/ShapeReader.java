import shapes.*;

import java.util.Scanner;

public class ShapeReader {
    public static Shape readShape(int figure, Scanner scanner){
        Shape shape = null;
        switch (figure){
            case 1:{
                System.out.print("Enter side: ");
                int side = scanner.nextInt();
                shape = new Square(side);
                break;
            }
            case 2:{
                System.out.print("Enter radius: ");
                int radius = scanner.nextInt();
                shape = new Circle(radius);
                break;
            }
            case 3:{
                System.out.print("Enter side1: ");
                int side1 = scanner.nextInt();
                System.out.print("Enter side2: ");
                int side2 = scanner.nextInt();
                System.out.print("Enter side3: ");
                int side3 = scanner.nextInt();
                shape = new Triangle(side1,side2,side3);
                break;
            }
            case 4:{
                System.out.print("Enter side1: ");
                int side1 = scanner.nextInt();
                System.out.print("Enter side2: ");
                int side2 = scanner.nextInt();
                shape = new Rectangle(side1,side2);
                break;
            }
            case 5:{
                System.out.print("Enter side1: ");
                int side1 = scanner.nextInt();
                System.out.print("Enter side2: ");
                int side2 = scanner.nextInt();
                System.out.print("Enter side3: ");
                int side3 = scanner.nextInt();
                System.out.print("Enter side4: ");
                int side4 = scanner.nextInt();
                System.out.print("Enter side5: ");
                int side5 = scanner.nextInt();
                shape = new Pentagon(side1,side2,side3,side4,side5);
                break;
            }
            case 6:{
                System.out.print("Enter side1: ");
                int side1 = scanner.nextInt();
                System.out.print("Enter side2: ");
                int side2 = scanner.nextInt();
                System.out.print("Enter side3: ");
                int side3 = scanner.nextInt();
                System.out.print("Enter side4: ");
                int side4 = scanner.nextInt();
                System.out.print("Enter h: ");
                int h = scanner.nextInt();
                shape = new Trapeze(side1,side2,side3,side4, h);
                break;
            }
            case 7:{
                System.out.print("Enter side1: ");
                int side1 = scanner.nextInt();
                System.out.print("Enter side2: ");
                int side2 = scanner.nextInt();
                System.out.print("Enter h: ");
                int h = scanner.nextInt();
                shape = new Parallelogram(side1,side2, h);
                break;
            }
            default:{
                System.out.println("incorrect input.");
            }
        }
        return shape;
    }
}
