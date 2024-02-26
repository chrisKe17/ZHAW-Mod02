import java.util.Scanner;

public class Bowling {
    public static void main(String[] args) {
        // 3 Spieler 5 Runden
        int[][] resultate = new int[5][3];
        // Summen für die 3 Spieler
        int[] summen = new int[3];

        for (int i = 1; i <= 5; i++) { //Rundenzähler
            for (int j = 1; j <= 3; j++) { //Spielerzähler
                System.out.println("Resultat für Runde " + i + " für Spieler" + j + " eintragen: ");
                Scanner scanner = new Scanner(System.in);
                resultate[i-1][j-1] = scanner.nextInt();
                //System.out.println("Resultat: " + resultate[i-1][j-1]);
                summen[j-1] = summen[j-1] + resultate [i-1][j-1];
                //System.out.println("Summe: " + summen[j-1]);
            }
        }

        System.out.println("         ---------------");
        System.out.println("         ----Spieler----");
        System.out.println("         ---------------");
        System.out.println("         --1----2----3--");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i +" .Runde" + "   " + resultate[i - 1][0] +"    "+ resultate[i - 1][1] +"    "+ resultate[i - 1][2]);
        }
        System.out.println("         ---------------");
        System.out.println("          "+summen[0]+"   "+summen[1]+"   "+summen[2]);
        System.out.println("         ---------------");
    }
}
