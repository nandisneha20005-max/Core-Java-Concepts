
public class TypeCasting {

    public static void main(String[] args) {

        // Widening Casting
        int num = 100;
        double result = num;

        System.out.println("Widening Casting: " + result);

        // Narrowing Casting
        double value = 99.99;
        int convertedValue = (int) value;

        System.out.println("Narrowing Casting: " + convertedValue);
    }
}
