import java.util.Scanner;

// Changed class name
class Temp {

    private double celsius;

    // No-Arg Constructor
    public Temp() {
        celsius = 0.0;
    }

    // Parameterized Constructor
    public Temp(double celsius) {
        this.celsius = celsius;
    }

    // Getter methods
    public double toCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Setter methods
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5 / 9;
    }
}

// Main class
public class Main2 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = x.nextDouble();

        // Use new class name
        Temp temperature = new Temp();

        temperature.setFahrenheit(fahrenheit);

        System.out.println("Temperature in Celsius: "
                + temperature.toCelsius());

        x.close();
    }
}