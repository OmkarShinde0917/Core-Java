import java.util.*;

public class PerimeterCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Choose a shape to calculate its perimeter:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice (1, 2, or 3): ");
        choice = scanner.nextInt();

        switch (choice) {
            //For Square
            case 1:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double squarePerimeter = 4 * side;
                System.out.println("Perimeter of the square: " + squarePerimeter);
                break;
            //For Rectangle
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectanglePerimeter = 2 * (length + width);
                System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                break;
            //For Circle
            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double circlePerimeter = 2 * Math.PI * radius;
                System.out.println("Perimeter of the circle: " + circlePerimeter);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }


}


