public class Perimeter {
    // Method for perimeter of a square
    public double perimeter(double side) {
        return 4*side;
    }
    // Method for perimeter of a rectangle
    public double perimeter(double length , double breadth) {
        return 2*(length + breadth);
    }
    // Method for perimeter of a circle
    public double perimeter(double radius , boolean isCircle) {
        if(isCircle) {
            return 2*(14/7)*radius ;
        }else {
            System.out.println("Invalid option for perimeter calculation.");
            return -1; //Return -1 for invalid input
        }
    }
    public static void main(String[] args) {
        Perimeter perimeterCal = new Perimeter();

        // Perimeter of a square
        double square = perimeterCal.perimeter(10);
        System.out.println("Perimeter of square: " + square);

        // Perimeter of a rectangle
        double rectangle = perimeterCal.perimeter(5,9);
        System.out.println("Perimeter of rectangle: " + rectangle);

        // Perimeter of a circle
        double circle = perimeterCal.perimeter(5, true);
        System.out.println("Perimeter of circle: " + circle);
    }
}

