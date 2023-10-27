package shapes;

import java.util.Objects;

public class Rectangle extends Shape{
    private int sideA;
    private int sideB;
    public Rectangle(){
        super();
        sideA = 0;
        sideB = 0;
    }
    public Rectangle(int sideA, int sideB){
        super();
        this.sideA = sideA;
        this.sideB = sideB;
    }
    @Override
    public String getShapeName(){
        return "Rectangle";
    }
    @Override
    public void showShapeExplanation() {
        System.out.println("A rectangle is a two-dimensional geometric shape with four\nsides and four right angles, where opposite sides are equal in length.");
        System.out.println("To find a perimeter you should use formula: (side1 + side2) * 2");
        System.out.println("To find a square you should use a formula: side1 * side2");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (sideA == rectangle.sideA && sideB == rectangle.sideB) || (sideA == rectangle.sideB && sideB == rectangle.sideA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculating perimeter with formula: 4 * side");
        System.out.println("Your sides: " + sideA + ", " + sideB);
        perimeter = (sideA + sideB) * 2.0;
        System.out.println("Perimeter = (" + sideA + " + " + sideB + ") * 2.0 = " + perimeter);
    }

    @Override
    public void calculateSquare() {
        System.out.println("Calculating square with formula: side1 * side2");
        System.out.println("Your sides: " + sideA + ", " + sideB);
        square = sideA * sideB;
        System.out.println("Square = " + sideA + " * " + sideB + " = " + square);
    }
}
