import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        switch (operator) {

            case '+':
                System.out.println("Result = " + (number1 + number2));
                break;

            case '-':
                System.out.println("Result = " + (number1 - number2));
                break;

            case '*':
                System.out.println("Result = " + (number1 * number2));
                break;

            case '/':
                if (number2 != 0) {
                    System.out.println("Result = " + (number1 / number2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            case '%':
                if (number2 != 0) {
                    System.out.println("Result = " + (number1 % number2));
                } else {
                    System.out.println("Cannot perform modulus by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}