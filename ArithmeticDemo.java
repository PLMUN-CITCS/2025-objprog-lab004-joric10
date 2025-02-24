public class ArithmeticDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        double num3 = 3.0;  // Not used, but can be used for floating-point operations

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2; // Integer division
        int remainder = num1 % num2;
        int expressionResult = num1 + num2 * 2 - (num1 / num2);

        // If you want precise division, use double:
        double preciseQuotient = (double) num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Integer Quotient: " + quotient);
        System.out.println("Precise Quotient: " + preciseQuotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Expression Result: " + expressionResult);
    }
}
