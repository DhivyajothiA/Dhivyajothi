import java.util.Scanner;

class Calculator {

    double a, b;
    String operation;

    
    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

  
    double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;

            case "sub":
                return a - b;

            case "mul":
                return a * b;

            case "div":
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    return 0;
                }
                return a / b;

            default:
                System.out.println("Invalid operation type!");
                return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add/sub/mul/div): ");
        String op = sc.next();
        Calculator calc = new Calculator(a, b, op);
        double result = calc.calculate();

        System.out.println("Result: " + result);
    }
}
