import java.util.Scanner;

class Calculator {

    // Method for addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/subtract/multiply/divide): ");
        String operation = sc.next();

        double result = 0.0;

        switch (operation.toLowerCase()) {
            case "add":
                result = calc.add(a, b);
                break;
            case "subtract":
                result = calc.subtract(a, b);
                break;
            case "multiply":
                result = calc.multiply(a, b);
                break;
            case "divide":
                try {
                    result = calc.divide(a, b);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation type.");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
