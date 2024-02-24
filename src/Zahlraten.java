import java.util.Scanner;

public class Zahlraten {
    public static void main(String[] args) {
        int secretNr = 80;
        boolean success = false;
        int anzVersuche = 0;

        do {
            System.out.print("Gesucht ist eine Zahl zwischen 1 und 100 . Geben sie eine Zahl ein: ");
            Scanner scanner = new Scanner(System.in);
            int guessNr = scanner.nextInt();
            anzVersuche = anzVersuche + 1;

            if (guessNr < 0 || guessNr > 100) {
                System.out.println("Zahl ausserhalb des Bereiches");
            } else if (guessNr == secretNr) {
                success = true;
                System.out.println("Zahl erraten. Sie haben " + anzVersuche + " Versuche benötigt.");
            } else {
                    if (guessNr < secretNr) {
                        System.out.println("Die Zahl ist zu klein");
                    } else {
                        System.out.println("Die Zahl ist zu gross");
                    }
            }
        } while (!success);
    }
}
