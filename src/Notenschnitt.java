import java.util.Scanner;

public class Notenschnitt {
    public static void main(String[] args) {
        float note = 1;
        int anzNoten = 0;
        float totalNoten =0;
        System.out.println("Bitte geben sie ihre Noten ein: (0 für Eingabe beenden:) ");

        do {
            anzNoten = anzNoten + 1;
            System.out.print(anzNoten+". Note: ");
            Scanner scanner = new Scanner(System.in);
            note = scanner.nextFloat();
            totalNoten = totalNoten + note;
        } while ((note != 0));
        float schnitt = (totalNoten / (float) (anzNoten -1));
        System.out.println("Es wurden "+ (anzNoten-1) + " Noten eingeben. Schnitt = "+schnitt);
    }
}
