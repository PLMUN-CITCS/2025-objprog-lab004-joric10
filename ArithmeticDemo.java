public class ArithmeticDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        double num3 = 3.0;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2; // Integer division (10 / 5 = 2)
        int remainder = num1 % num2;

        // Order of operations:
        // num1 + (num2 * 2) - (num1 / num2)
        // = 10 + (5 * 2) - (10 / 5)
        // = 10 + 10 - 2
        // = 18
        int expressionResult = num1 + num2 * 2 - (num1 / num2);

        // If we want floating-point division:
        double preciseQuotient = num1 / num3; // 10 / 3.0 = 3.333...

        // Output
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient (Integer): " + quotient);
        System.out.println("Quotient (Precise): " + preciseQuotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Expression Result: " + expressionResult); // Order of operations explained
    }
}
