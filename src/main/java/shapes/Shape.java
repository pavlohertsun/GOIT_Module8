package shapes;

import shapes.interfaces.PerimeterCalculator;
import shapes.interfaces.SquareCalculator;

public abstract class Shape implements SquareCalculator, PerimeterCalculator {
    protected double perimeter;
    protected double square;

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquare() {
        return square;
    }

    public Shape(){
        perimeter = 0;
        square = 0;
    }
    public String getShapeName(){
        return "Shape";
    }

    public abstract void showShapeExplanation();

    @Override
    public String toString() {
        return "My shape is: shape";
    }
}
