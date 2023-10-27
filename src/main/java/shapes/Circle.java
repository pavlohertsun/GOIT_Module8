package shapes;

import java.util.Objects;

public class Circle extends Shape{
    private int radius;
    public Circle(){
        super();
        radius = 0;
    }
    public Circle(int radius){
        super();
        this.radius = radius;
    }
    @Override
    public String getShapeName(){
        return "Circle";
    }
    @Override
    public void showShapeExplanation() {
        System.out.println("A circle is a two-dimensional geometric shape that\nconsists of all points in a plane that are equidistant from a central point.\nIt is perfectly round and has no corners or edges.");
        System.out.println("To find a length you should use a formula: 2 * P * radius");
        System.out.println("To find a square you should use a formula: P * radius^2");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculating length with formula: 2 * P * radius");
        System.out.println("Your radius: " + radius);
        perimeter = (2 * radius * 3.1415);
        System.out.println("2 * 3.1415 * " + radius + " = " + perimeter);
    }

    @Override
    public void calculateSquare() {
        System.out.println("Calculating square with formula: P * radius^2");
        System.out.println("Your radius: " + radius);
        square = (radius * radius) * 3.1415;
        System.out.println("3.1415 * " + radius + "^2 = " + square);
    }
}
