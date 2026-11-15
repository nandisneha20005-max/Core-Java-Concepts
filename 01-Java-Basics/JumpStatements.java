

public class JumpStatements {
    public static void main(String[] args) {

        // Break Statement
        System.out.println("Break Statement:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        // Continue Statement
        System.out.println("Continue Statement:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        // Return Statement
        System.out.println("Return Statement:");
        display();
    }

    static void display() {
        System.out.println("Inside display method");
        return;
    }
}
