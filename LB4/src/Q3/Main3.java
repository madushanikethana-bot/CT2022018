import java.util.Scanner;

// Circle class
class Circle {

    // Private variable
    private double radius;

    // No-Argument Constructor
    public Circle() {
        radius = 0.0;
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Compute area
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Compute circumference
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

// Main class
public class Main3 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Input radii
        System.out.print("Enter inner radius (ri): ");
        double ri = x.nextDouble();

        System.out.print("Enter outer radius (ro): ");
        double ro = x.nextDouble();

        // Create Circle objects
        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        // Compute shaded area
        double shadedArea =
                outerCircle.computeArea()
                        - innerCircle.computeArea();

        // Display results
        System.out.println("Inner Circle Area: "
                + innerCircle.computeArea());

        System.out.println("Outer Circle Area: "
                + outerCircle.computeArea());

        System.out.println("Shaded Circular Region Area: "
                + shadedArea);

        System.out.println("Inner Circumference: "
                + innerCircle.computeCircumference());

        System.out.println("Outer Circumference: "
                + outerCircle.computeCircumference());

        x.close();
    }
}