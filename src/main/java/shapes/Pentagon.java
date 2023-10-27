package shapes;

import java.util.Objects;

public class Pentagon extends Shape{
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;
    private int sideE;
    public Pentagon(){
        super();
        sideA = 0;
        sideB = 0;
        sideC = 0;
        sideD = 0;
        sideE = 0;
    }
    public Pentagon(int sideA, int sideB, int sideC, int sideD, int sideE){
        super();
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideE = sideE;
    }
    @Override
    public String getShapeName(){
        return "Pentagon";
    }
    @Override
    public void showShapeExplanation() {
        System.out.println("A pentagon is a two-dimensional geometric shape with five straight sides and five angles.");
        System.out.println("To find a perimeter you should add all of your sides");
        System.out.println("To find a square you should add squares of two rectangles with sides (side1,side2,side3) and (side3,side4,side5)");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pentagon pentagon = (Pentagon) o;
        return sideA == pentagon.sideA && sideB == pentagon.sideB && sideC == pentagon.sideC && sideD == pentagon.sideD && sideE == pentagon.sideE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC, sideD, sideE);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculating perimeter by adding all sides");
        System.out.println("Your sides: " + sideA + ", " + sideB + ", " + sideC + ", " + sideD + ", " + sideE);
        perimeter = sideA + sideB + sideC + sideD + sideE;
        System.out.println("Perimeter = " + sideA + " + " + sideB + " + " + sideC + " + " + sideD + " + " + sideE + " = " + perimeter);
    }

    @Override
    public void calculateSquare() {
        Triangle t1 = new Triangle(sideA, sideB, sideC);
        Triangle t2 = new Triangle(sideC, sideD, sideE);
        System.out.println("Calculating square by adding squares of two rectangles with sides (side1,side2,side3) and (side3,side4,side5)");
        System.out.println("Your sides: " + sideA + ", " + sideB + ", " + sideC + ", " + sideD + ", " + sideE);
        System.out.println("Square of first triangle(side1,side2,side3):");
        t1.calculateSquare();
        System.out.println("Square of second triangle(side3,side4,side5):");
        t2.calculateSquare();
        double s1 = t1.getSquare();
        double s2 = t2.getSquare();
        square = s1 + s2;
    }
}
