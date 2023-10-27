package shapes;

import java.util.Objects;

public class Parallelogram extends Shape{
    private int sideA;
    private int sideB;
    private int h;

    public Parallelogram(){
        super();
        sideA = 0;
        sideB = 0;
        h = 0;
    }
    public Parallelogram(int sideA, int sideB, int h){
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.h = h;
    }

    @Override
    public String getShapeName(){
        return "Parallelogram";
    }
    @Override
    public void showShapeExplanation() {
        System.out.println("A parallelogram is a two-dimensional geometric shape\nwith four sides, where opposite sides are parallel and of equal length.");
        System.out.println("To find a perimeter you should use a formula: (side1 + side2) * 2");
        System.out.println("To find a square you should use a formula: side1 * h");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return sideA == that.sideA && sideB == that.sideB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculating length with formula: (side1 + side2) * 2");
        System.out.println("Your sides: " + sideA + ", " + sideB);
        perimeter = (sideA + sideB) * 2;
        System.out.println("(" + sideA + " + " + sideB + ") * 2 = " + perimeter);
    }

    @Override
    public void calculateSquare() {
        System.out.println("Calculating length with formula: (side1 + side2) * 2");
        System.out.println("Your sides: " + sideA + ", " + sideB);
        System.out.println("h: " + h);
        square = sideA * h;
        System.out.println(sideA + " * " + h + " = " + square);
    }
}
