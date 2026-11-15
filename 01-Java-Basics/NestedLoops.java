
public class NestedLoops {
    public static void main(String[] args) {

        // Square Pattern
        System.out.println("Square Pattern:");

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Right-Angled Triangle
        System.out.println("\nRight-Angled Triangle:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
