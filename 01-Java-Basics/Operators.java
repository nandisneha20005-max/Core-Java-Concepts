
public class Operators {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("AND: " + (x && y));
        System.out.println("OR: " + (x || y));
        System.out.println("NOT: " + (!x));

        // Assignment Operator
        int num = 5;
        num += 3;
        System.out.println("Assignment: " + num);

        // Increment and Decrement
        int count = 5;
        System.out.println("Increment: " + (++count));
        System.out.println("Decrement: " + (--count));
    }
}

