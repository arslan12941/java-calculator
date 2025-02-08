import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1st No --> ");
        double num1 = scanner.nextDouble();
        
        System.out.print("2nd No --> ");
        double num2 = scanner.nextDouble();
        
        System.out.println("\nSelect operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");   //New feature added
        System.out.println("6. Exponentiation (^)");  //New feature added
        System.out.print("Enter your choice (1-6): ");
        
        int choice = scanner.nextInt();
        double result = 0;
        boolean validOperation = true;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            case 5:  //Modulus case
                result = modulus((int) num1, (int) num2);
                break;
            case 6:  //Exponentiation case
                result = exponentiation(num1, num2);
                break;
            default:
                System.out.println("Invalid choice! Please select 1-6.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("\nResult: " + result);
        }
        
        scanner.close();
    }

    //Modulus Method
    public static int modulus(int a, int b) {
        return a % b;
    }

    //Exponentiation Method
    public static double exponentiation(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}