
class MethodWithReturnValue {

    // Method that returns the sum of two numbers
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        // Calling the method
        int result = add(10, 20);

        // Displaying the returned value
        System.out.println("Sum = " + result);
    }
}
