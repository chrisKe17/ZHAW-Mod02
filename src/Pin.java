import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
            System.out.print("1. Ziffer: ");

            int a = scanner.nextInt();
            System.out.print("2. Ziffer: ");

            int b = scanner.nextInt();
            System.out.print("3. Ziffer: ");

            int c = scanner.nextInt();
            System.out.println("Sie haben eingegeben: " + a + b + c);

            if (a == 1 && b == 2 && c == 3) {
                System.out.println("offen");
            } else {
                System.out.println("Falscher PIN ");
            }
        }
    }
}