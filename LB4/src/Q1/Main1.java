import java.util.Scanner;

// Temperature class
class Temperature {

    // Private variable
    private double celsius;

    // No-Argument Constructor
    public Temperature() {
        celsius = 0.0;
    }

    // Parameterized Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter method for Celsius
    public double toCelsius() {
        return celsius;
    }

    // Getter method for Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Setter method for Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Setter method for Fahrenheit
    public void setFahrenheit(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5 / 9;
    }
}

// Main class
public class Main1 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Input Celsius temperature
        System.out.print("Enter temperature in Celsius: ");
        double celsius = x.nextDouble();

        // Create object using parameterized constructor
        Temperature temp = new Temperature(celsius);

        // Output Fahrenheit
        System.out.println("Temperature in Fahrenheit: "
                + temp.toFahrenheit());

        x.close();
    }
}