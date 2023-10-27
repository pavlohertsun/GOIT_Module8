import shapes.Shape;

public class ShapeInfoPrinter {
    public void printShapeName(Shape shape){
        System.out.println("Your shape is: " + shape.getShapeName());
    }
    public void printShapePerimeter(Shape shape){
        System.out.println("Perimeter of: " + shape.getShapeName() + " is: "+ shape.getPerimeter());
    }
    public void printShapeSquare(Shape shape){
        System.out.println("Square of: " + shape.getShapeName() + " is: "+ shape.getSquare());
    }
}
