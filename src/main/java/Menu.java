import shapes.*;

public class Menu {
    public void showOptions() {
        System.out.println("[1] - square");
        System.out.println("[2] - circle");
        System.out.println("[3] - triangle");
        System.out.println("[4] - rectangle");
        System.out.println("[5] - pentagon");
        System.out.println("[6] - trapeze");
        System.out.println("[7] - parallelogram");
        System.out.println("[0] - quit");
    }

    public void showExamplesOptions() {
        System.out.println("[1] - perimeter example");
        System.out.println("[2] - square example");
        System.out.println("[3] - both");
        System.out.println("[0] - quit");
        System.out.print("Do you want to see examples: ");
    }

    public void showShapeInfo(int choice) {
        switch (choice) {
            case 1: {
                Square square = new Square();
                square.showShapeExplanation();
                break;
            }
            case 2: {
                Circle circle = new Circle();
                circle.showShapeExplanation();
                break;
            }
            case 3: {
                Triangle triangle = new Triangle();
                triangle.showShapeExplanation();
                break;
            }
            case 4: {
                Rectangle rectangle = new Rectangle();
                rectangle.showShapeExplanation();
                break;
            }
            case 5: {
                Pentagon pentagon = new Pentagon();
                pentagon.showShapeExplanation();
                break;
            }
            case 6: {
                Trapeze trapeze = new Trapeze();
                trapeze.showShapeExplanation();
                break;
            }
            case 7: {
                Parallelogram parallelogram = new Parallelogram();
                parallelogram.showShapeExplanation();
                break;
            }
            default: {
                System.out.println("Incorrect input.");
                break;
            }
        }
    }
    public void showExample(Shape shape, int action){
        ShapeInfoPrinter shapeInfoPrinter = new ShapeInfoPrinter();
        switch (action){
            case 1:{
                makeLine();
                shape.calculatePerimeter();
                makeLine();
                shapeInfoPrinter.printShapeName(shape);
                shapeInfoPrinter.printShapePerimeter(shape);
                break;
            }
            case 2:{
                makeLine();
                shape.calculateSquare();
                makeLine();
                shapeInfoPrinter.printShapeName(shape);
                shapeInfoPrinter.printShapeSquare(shape);
                break;
            }
            case 3:{
                makeLine();
                shape.calculatePerimeter();
                shape.calculateSquare();
                makeLine();
                shapeInfoPrinter.printShapeName(shape);
                shapeInfoPrinter.printShapePerimeter(shape);
                shapeInfoPrinter.printShapeSquare(shape);
                break;
            }
            default:{
                System.out.println("Goodbye!");
            }
        }
    }
    public void makeLine(){
        System.out.println("========================================================");
    }

}
