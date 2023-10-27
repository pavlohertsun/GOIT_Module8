import shapes.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my graphic redactor!");
        menu.makeLine();
        menu.showOptions();
        System.out.print("Choose the figure u want to see information about: ");
        int figure = sc.nextInt();
        menu.makeLine();
        menu.showShapeInfo(figure);
        menu.makeLine();
        if(figure != 0){
            menu.showExamplesOptions();
            int choice = sc.nextInt();
            menu.makeLine();
            Shape shape = ShapeReader.readShape(figure, sc);
            menu.showExample(shape,choice);
        }
        sc.close();
    }
}
