package shapes;

import java.util.Objects;

public class Triangle extends Shape{
    private int sideA;
    private int sideB;
    private int sideC;
    public Triangle(){
        super();
        sideA = 0;
        sideB = 0;
        sideC = 0;
    }
    public Triangle(int sideA, int sideB, int sideC){
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public String getShapeName(){
        return "Triangle";
    }
    @Override
    public void showShapeExplanation() {
        System.out.println("A triangle is a two-dimensional geometric\nshape with three straight sides and three angles.");
        System.out.println("To find a perimeter you should add all of your sides");
        System.out.println("To find a square you should use a formula: Square root of (s * (s - side1) * (s - side2) * (s - side3)) (s is a half of perimeter).");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sideA == triangle.sideA && sideB == triangle.sideB && sideC == triangle.sideC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculating perimeter by adding all sides");
        System.out.println("Your sides: " + sideA + ", " + sideB + ", " + sideC);
        perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter = " + sideA + " + " + sideB + " + " + sideC + " = " + perimeter);
    }

    @Override
    public void calculateSquare() {
        System.out.println("Calculating square with formula: Square root of (s * (s - side1) * (s - side2) * (s - side3)) (s is a half of perimeter)");
        System.out.println("Your sides: " + sideA + ", " + sideB + ", " + sideC);
        double semiPerimeter = (sideA + sideB + sideC) / 2.0;
        System.out.println("Half of perimeter(s) = " + sideA + " + " + sideB + " + " + sideC + " = " + semiPerimeter);
        square = Math.abs(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        System.out.println("Square = Abs of(" + semiPerimeter + "* (" + semiPerimeter + " - " + sideA + ") * (" + semiPerimeter + " - " + sideB + ") * (" + semiPerimeter + " - " + sideC + ")) = " + square);
    }
}
