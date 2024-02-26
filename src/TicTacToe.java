import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        // Spielbrett definieren und mit Unterstrich füllen
        String[][] brett = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                brett[i][j] = "_";
            }
        }

        //Leeres Spielbrett aufzeichnen
        System.out.println("Spalte    1 2 3");
        System.out.println("----------------");
        System.out.println("Zeile 1:  " + brett[0][0] + "|" + brett[0][1] + "|" + brett[0][2] + "|");
        System.out.println("Zeile 2:  " + brett[1][1] + "|" + brett[1][1] + "|" + brett[1][2] + "|");
        System.out.println("Zeile 3:  " + brett[2][0] + "|" + brett[2][1] + "|" + brett[2][2] + "|");
        System.out.println("----------------");

        int winKombi = 0;
        int runde = 0;
        String zeichenSpieler;

        do {
            int spielernr = (runde%2) + 1; // Spielernummer ist abwechslungsweise 1 oder 2

            if (spielernr == 1) {
                zeichenSpieler = "X"; // Zeichen für Spieler 1
            } else {
                zeichenSpieler = "O";
            }

            System.out.println("Spieler " + spielernr + ": " + " Für das gewünschte Feld die Zeilen-Nr. eingeben: ");
            Scanner scanner = new Scanner(System.in);
            int brettZeile = scanner.nextInt();
            System.out.println("Spieler " + spielernr + ": " + " Für das gewünschte Feld die Spalten-Nr. eingeben: ");
            int brettSpalte = scanner.nextInt();
            brett[brettZeile - 1][brettSpalte - 1] = zeichenSpieler;

            System.out.println("Spalte    1 2 3");
            System.out.println("----------------");
            System.out.println("Zeile 1:  " + brett[0][0] + "|" + brett[0][1] + "|" + brett[0][2] + "|");
            System.out.println("Zeile 2:  " + brett[1][0] + "|" + brett[1][1] + "|" + brett[1][2] + "|");
            System.out.println("Zeile 3:  " + brett[2][0] + "|" + brett[2][1] + "|" + brett[2][2] + "|");
            System.out.println("----------------");

            //Prüfung Gewinnkombination

            if ((brett[0][0] == "X") && (brett[0][1] == "X") && (brett[0][2] == "X")) {
                winKombi = 1;
            }
            if ((brett[1][0] == "X") && (brett[1][1] == "X") && (brett[1][2] == "X")) {
                winKombi = 1;
            }
            if ((brett[2][0] == "X") && (brett[2][1] == "X") && (brett[2][2] == "X")) {
                winKombi = 1;
            }
            if ((brett[0][0] == "X") && (brett[1][0] == "X") && (brett[2][0] == "X")) {
                winKombi = 1;
            }
            if ((brett[0][1] == "X") && (brett[1][1] == "X") && (brett[2][1] == "X")) {
                winKombi = 1;
            }
            if ((brett[0][2] == "X") && (brett[1][2] == "X") && (brett[2][2] == "X")) {
                winKombi = 1;
            }
            if ((brett[0][0] == "X") && (brett[1][1] == "X") && (brett[2][2] == "X")) {
                winKombi = 1;
            }
            if ((brett[0][2] == "X") && (brett[1][1] == "X") && (brett[2][0] == "X")) {
                winKombi = 1;
            }

            if ((brett[0][0] == "O") && (brett[0][1] == "O") && (brett[0][2] == "O")) {
                winKombi = 2;
            }
            if ((brett[1][0] == "O") && (brett[1][1] == "O") && (brett[1][2] == "O")) {
                winKombi = 2;
            }
            if ((brett[2][0] == "O") && (brett[2][1] == "O") && (brett[2][2] == "O")) {
                winKombi = 2;
            }
            if ((brett[0][0] == "O") && (brett[1][0] == "O") && (brett[2][0] == "O")) {
                winKombi = 2;
            }
            if ((brett[0][1] == "O") && (brett[1][1] == "O") && (brett[2][1] == "O")) {
                winKombi = 2;
            }
            if ((brett[0][2] == "O") && (brett[1][2] == "O") && (brett[2][2] == "O")) {
                winKombi = 2;
            }
            if ((brett[0][0] == "O") && (brett[1][1] == "O") && (brett[2][2] == "O")) {
                winKombi = 2;
            }
            if ((brett[0][2] == "O") && (brett[1][1] == "O") && (brett[2][0] == "O")) {
                winKombi = 2;
            }

            if ((brett[0][0] != "_") && (brett[0][1] != "_") && (brett[0][2] != "_") &&
                    (brett[1][0] != "_") && (brett[1][1] != "_") && (brett[1][2] != "_") &&
                    (brett[2][0] != "_") && (brett[2][1] != "_") && (brett[2][2] != "_")) {
                winKombi = 3;
            }

            if (winKombi == 1) {
                System.out.println("Spieler 1 hat gewonnen");
                break;
            }

            if (winKombi == 2) {
                System.out.println("Spieler 2 hat gewonnen");
                break;
            }

            if (winKombi == 3) {
                System.out.println("Kein Gewinner");
                break;
            }
            runde = runde + 1;

        } while (winKombi == 0);

    }
}
