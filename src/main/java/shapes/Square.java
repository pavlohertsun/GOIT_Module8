package shapes;

import java.util.Objects;

public class Square extends Shape{
    private int side;
    public Square(){
        super();
        side = 0;
    }

    public Square(int side){
        super();
        this.side = side;
    }

    @Override
    public String getShapeName(){
        return "Square";
    }

    @Override
    public void showShapeExplanation() {
        System.out.println("A square is a geometric shape with four equal sides and four right angles between the sides.");
        System.out.println("To find a perimeter you should use a formula: 4 * side");
        System.out.println("To find a square you should use a formula: side * side");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return side == square.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculating perimeter with formula: 4 * side");
        System.out.println("Your side: " + side);
        perimeter = side * 4;
        System.out.println("Perimeter = " + side + " * 4 = " + perimeter);
    }

    @Override
    public void calculateSquare() {
        System.out.println("Calculating square with formula: side * side");
        System.out.println("Your side: " + side);
        square = side * side;
        System.out.println("Square = " + side + " * " + side + " = " + square);
    }
}
