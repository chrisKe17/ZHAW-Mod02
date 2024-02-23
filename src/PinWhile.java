import java.util.Scanner;

public class PinWhile {
    public static void main(String[] args) {
        boolean zustand = false;
        int versuchnr = 0;
        int versuche = 3;

        while (!zustand) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
            System.out.print("1. Ziffer: ");

            int a = scanner.nextInt();
            System.out.print("2. Ziffer: ");

            int b = scanner.nextInt();
            System.out.print("3. Ziffer: ");

            int c = scanner.nextInt();
            System.out.println("Sie haben eingegeben: " + a + b + c);
            versuchnr = versuchnr + 1;
            versuche = versuche - 1;

            if (a == 1 && b == 2 && c == 3) {
                System.out.println("offen");
                zustand = true;
            } else {
                System.out.println("Falscher PIN ");
                System.out.println("Sie haben noch " + versuche + " Versuche");
            }
        }
    }
}