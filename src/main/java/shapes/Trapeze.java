package shapes;

import java.util.Objects;

public class Trapeze extends Shape{
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;
    private int h;
    public Trapeze(){
        super();
        sideA = 0;
        sideB = 0;
        sideC = 0;
        sideD = 0;
        h = 0;
    }
    public Trapeze(int sideA, int sideB, int sideC, int sideD, int h){
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideC;
        this.h = h;
    }
    @Override
    public String getShapeName(){
        return "Trapeze";
    }
    @Override
    public void showShapeExplanation() {
        System.out.println("A trapeze is a two-dimensional geometric shape with four sides,\nwhere two of the sides are parallel and the other two sides are not. ");
        System.out.println("To find a perimeter you should add all of your sides");
        System.out.println("To find a square you should use a formula: (side1 + side2) * h / 2");
    }
    @Override
    public String toString() {
        return "My shape is: square" +
                ", sides: " + sideA + ", " + sideB + ", " + sideC + ", " +sideD +
                ", height: " + h +
                ", perimeter: " + perimeter +
                ", square: " + square;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC, sideD);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculating perimeter by adding all sides");
        System.out.println("Your sides: " + sideA + ", " + sideB + ", " + sideC + ", " + sideD);
        perimeter = sideA + sideB + sideC + sideD;
        System.out.println("Perimeter = " + sideA + " + " + sideB + " + " + sideC + " + " + sideD + " = " + perimeter);
    }

    @Override
    public void calculateSquare() {
        System.out.println("Calculating square with formula: (side1 + side2) * h / 2");
        System.out.println("Your sides: " + sideA + ", " + sideB + ", " + sideC + ", " + sideD);
        square = (sideA + sideB) * h / 2.0;
        System.out.println("Square = (" + sideA + " + " + sideB + ") * " + h + " / 2.0 = " + square);
    }
}
