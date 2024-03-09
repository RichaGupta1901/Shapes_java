import java.util.*;

//Richa Gupta
//22070126087
//AIML B1

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Menu for Actions
            System.out.println("Select a shape: ");
            System.out.println("1. Circle ");
            System.out.println("2. Sphere ");
            System.out.println("3. Square ");
            System.out.println("4. Rectangle ");
            System.out.println("5. Cylinder ");
            System.out.println("6. Pyramid ");
            System.out.println("7. Exit ");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("---You chose Circle---");
                    System.out.println("Enter the radius (in cm): ");
                    double radius = scanner.nextInt();
                    Circle circle = new Circle();
                    circle.setRadius(radius);
                    System.out.println("Perimeter: " + circle.calculatePerimeter());
                    System.out.println("Area: " + circle.calculateArea());
                    break;

                case 2:
                    System.out.println("---You chose Sphere---");
                    System.out.println("Enter the radius (in cm):");
                    radius = scanner.nextDouble();
                    Sphere sphere = new Sphere();
                    sphere.setRadius(radius);
                    System.out.println("Area: " + sphere.calculateArea());
                    System.out.println("Volumne: " + sphere.calculateVolume());
                    break;

                case 3:
                    System.out.println("---You chose Square---");
                    System.out.println("Enter the side (in cm):");
                    double side = scanner.nextDouble();
                    Square square = new Square();
                    square.setSide(side);
                    System.out.println("Perimeter: " + square.calculatePerimeter());
                    System.out.println("Area: " + square.calculateArea());
                    break;

                case 4:
                    System.out.println("---You chose Rectangle---");
                    System.out.println("Enter the length (in cm):");
                    double length = scanner.nextDouble();
                    System.out.println("Enter the breadth (in cm):");
                    double breadth = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle();
                    rectangle.setLength(length);
                    rectangle.setBreadth(breadth);
                    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
                    System.out.println("Area: " + rectangle.calculateArea());
                    break;

                case 5:
                    System.out.println("---You chose Cylinder---");
                    System.out.println("Enter the radius (in cm):");
                    radius = scanner.nextDouble();
                    System.out.println("Enter the height (in cm):");
                    double height = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder();
                    cylinder.setRadius(radius);
                    cylinder.setHeight(height);
                    System.out.println("Area: " + cylinder.calculateArea());
                    System.out.println("Volumne: " + cylinder.calculateVolume());
                    break;

                case 6:
                    System.out.println("---You chose Pyramid---");
                    System.out.println("Enter the length of the edge of base (in cm):");
                    double baseEdgeLength = scanner.nextDouble();
                    System.out.println("Enter the slant height (in cm):");
                    double slantHeight = scanner.nextDouble();
                    Pyramid pyramid = new Pyramid();
                    pyramid.setBaseEdgeLength(baseEdgeLength);
                    pyramid.setSlantHeight(slantHeight);
                    System.out.println("Area: " + pyramid.calculateArea());
                    System.out.println("Volumne: " + pyramid.calculateVolume());
                    break;

                case 7:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");

                    scanner.close();
            }
        } while (choice != 7);

    }

}
