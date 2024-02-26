import java.util.Scanner;

public class PockerAlt {
    public static void main(String[] args) {
        int farbe1, farbe2, farbe3, farbe4, farbe5, wert1, wert2, wert3, wert4, wert5;

        System.out.println("P O K E R");
        System.out.println("*********");
        System.out.println("Information zur Codierung der Karten");
        System.out.println("WERT:");
        System.out.println("2 bis 10: gemäss Kartenwert");
        System.out.println("11:Junge, 12:Dame, 13:König, 14:As");
        System.out.println("FARBE:");
        System.out.println("1:Pik, 2:Herz, 3:Kreuz, 4:Karo" );
        System.out.println("EINGABE IHRER KARTEN");
        System.out.println("--------------------");
        System.out.println("Geben Sie Ihre Karten ein!");

        Scanner eingabe = new Scanner(System.in);
        System.out.print("1. Wert: ");
        String eingabe1 = eingabe.next();
        wert1 = Integer.parseInt(eingabe1);
        //wert1 = 8;
        System.out.print("1. Farbe: ");
        String eingabe2 = eingabe.next();
        farbe1 = Integer.parseInt(eingabe2);
        //farbe1 = 1;

        System.out.print("2. Wert: ");
        String eingabe3 = eingabe.next();
        wert2 = Integer.parseInt(eingabe3);
        //wert2 = 9;
        System.out.print("2. Farbe: ");
        String eingabe4 = eingabe.next();
        farbe2 = Integer.parseInt(eingabe4);
        //farbe2 = 1;

        System.out.print("3. Wert: ");
        String eingabe5 = eingabe.next();
        wert3 = Integer.parseInt(eingabe5);
        //wert3 = 10;
        System.out.print("3. Farbe: ");
        String eingabe6 = eingabe.next();
        farbe3 = Integer.parseInt(eingabe6);
        //farbe3 = 1;

        System.out.print("4. Wert: ");
        String eingabe7 = eingabe.next();
        wert4 = Integer.parseInt(eingabe7);
        //wert4 = 11;
        System.out.print("4. Farbe: ");
        String eingabe8 = eingabe.next();
        farbe4 = Integer.parseInt(eingabe8);
        //farbe4 = 1;

        System.out.print("5. Wert: ");
        String eingabe9 = eingabe.next();
        wert5 = Integer.parseInt(eingabe9);
        //wert5 =12;
        System.out.print("5. Farbe: ");
        String eingabe10 = eingabe.next();
        farbe5 = Integer.parseInt(eingabe10);
        //farbe5 = 1;

        System.out.println("Sie haben eingegeben:");
        System.out.println("*********************");
        System.out.println("Karte 1: Wert: " + wert1 + " Farbe: " + farbe1);
        System.out.println("Karte 2: Wert: " + wert2 + " Farbe: " + farbe2);
        System.out.println("Karte 3: Wert: " + wert3 + " Farbe: " + farbe3);
        System.out.println("Karte 4: Wert: " + wert4 + " Farbe: " + farbe4);
        System.out.println("Karte 5: Wert: " + wert5 + " Farbe: " + farbe5);


        //Sortierung der Hand
        int [] werte = {wert1,wert2,wert3,wert4,wert5};
        int [] farben = {farbe1,farbe2,farbe3,farbe4,farbe5};
        boolean tausch = false;

        for (int i = 0; i < 4;) {
            do {
                if (werte[i + 1] > werte[i]) {
                    int wertzwischen = werte[i];
                    int farbezwischen = farben[i];
                    werte[i] = werte[i + 1];
                    farben[i] = farben[i + 1];
                    werte[i + 1] = wertzwischen;
                    farben[i + 1] = farbezwischen;
                    tausch = true;
                    i=0;
                } else {
                    tausch = false;
                    i = i + 1;
                }
            } while (tausch == true);
        }

        System.out.println("Die Karten wurden sortiert:");
        System.out.println("*********************");
        System.out.println("Karte 1: Wert: " + werte[0] + " Farbe: " + farben[0]);
        System.out.println("Karte 2: Wert: " + werte[1] + " Farbe: " + farben[1]);
        System.out.println("Karte 3: Wert: " + werte[2] + " Farbe: " + farben[2]);
        System.out.println("Karte 4: Wert: " + werte[3] + " Farbe: " + farben[3]);
        System.out.println("Karte 5: Wert: " + werte[4] + " Farbe: " + farben[4]);
        wert1=werte[0];
        wert2=werte[1];
        wert3=werte[2];
        wert4=werte[3];
        wert5=werte[4];
        farbe1=farben[0];
        farbe2=farben[1];
        farbe3=farben[2];
        farbe4=farben[3];
        farbe5=farben[4];

        // Bewertung der Hand
        int hand=0;
        if ((wert1==14)&&(wert2==13)&&(wert3==12)&&(wert4==11)&&(wert5==10)){
            if ((farbe1==farbe2)&&(farbe1==farbe3)&&(farbe1==farbe4)&&(farbe1==farbe5)){
                hand = 100;
            }
        }
        if ((farbe1==farbe2)&&(farbe1==farbe3)&&(farbe1==farbe4)&&(farbe1==farbe5)) {
            if (hand < 60) {
                hand = 60;
            }
            if ((wert2 == (wert1 - 1)) && (wert3 == (wert1 - 2)) && (wert4 == (wert1 - 3)) && (wert5 == (wert1 - 4))) {
                if (hand < 90) {
                    hand = 90;
                }
                hand = 90;
            }
        }
        if ((wert1 == wert2 && wert1 == wert3 && wert1 == wert4) || (wert2 == wert3 && wert2 == wert4 && wert2 == wert5)) {
            if (hand < 80) {
                hand = 80;
            }
        }
        if (((wert2 == (wert1 - 1)) && (wert3 == (wert1 - 2)) && (wert4 == (wert1 - 3)) && (wert5 == (wert1 - 4)))) {
            if (hand < 50) {
                hand = 50;
            }
        }
        if (wert1 == wert2 && wert1 == wert3) {
            if (hand < 40) {
                hand = 40;
            }
            if (wert4 == wert5) {
                if (hand < 70) {
                    hand = 70;
                }
            }
        }
        if (wert2 == wert3 && wert2 == wert4) {
            if (hand < 40) {
                hand = 40;
            }
            if (wert1 == wert5) {
                if (hand < 70) {
                    hand = 70;
                }
            }
        }
        if (wert3 == wert4 && wert3 == wert5) {
            if (hand < 40) {
                hand = 40;
            }
            if (wert1 == wert2) {
                if (hand < 70) {
                    hand = 70;
                }
            }
        }
        if (wert1==wert2) {
            if (hand < 20) {
                hand = 20;
            }
            if (wert3 == wert4 || wert3 == wert5) {
                if (hand < 30) {
                    hand = 30;
                }
            }
        }
        if (wert2==wert3) {
            if (hand < 20) {
                hand = 20;
            }
            if (wert4 == wert5) {
                if (hand < 30) {
                    hand = 30;
                }
            }
        }
        if (wert4==wert5) {
            if (hand < 20) {
                hand = 20;
            }
        }

        System.out.println(hand);

        switch (hand){
            case 100:
                System.out.println("Royal Flush");
                break;
            case 90:
                System.out.println("Straight Flush");
                break;
            case 80:
                System.out.println("Four Kind");
                break;
            case 70:
                System.out.println("Full House");
                break;
            case 60:
                System.out.println("Flush");
                break;
            case 50:
                System.out.println("Straight");
                break;
            case 40:
                System.out.println("Three Kind");
                break;
            case 30:
                System.out.println("Two Pairs");
                break;
            case 20:
                System.out.println("One Pair");
                break;
        }
    }
}
