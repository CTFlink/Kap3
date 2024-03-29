import java.util.Scanner;

public class Opg3_17 {
    public static void main(String[] args) {

        //Sten Saks Papir spil

        //Her initialiseres nogle variable og en metode som programmet skal bruge
        String choice = "initialized";
        int choiceInNumber = 3;
        Scanner input = new Scanner(System.in);
        int i=0;

        //Brugeren skal nu til at vælge Sten, Saks eller Papir.
        //Til det bruger jeg et while loop som fortsætter indtil brugeren har indtastet en gyldig værdi f.eks. 'sten'

        while(i<1) {
            System.out.println("Vælg en: sten, saks, papir?");
            choice = input.next();

            //Her undersøges det om brugerens valg er sten saks eller papir

            if (choice.equalsIgnoreCase("sten")) {
                choiceInNumber = 0;
                i++;
            } else if (choice.equalsIgnoreCase("saks")) {
                choiceInNumber = 1;
                i++;
            } else if (choice.equalsIgnoreCase("papir")) {
                choiceInNumber = 2;
                i++;
            } else System.out.println("fejl i indtastning! Skriv enten 'sten', 'saks' eller 'papir'");
        }

        System.out.printf("Du valgte %s \n" , choice);

        //Her vælger computeren sten, saks eller papir

        int ssp = (int)(10 * Math.random()) % 3;

        //Her fortæller computeren hvad den valgte

        if (ssp == 0) System.out.println("Computeren valgte sten");
        else if (ssp == 1) System.out.println("Computeren valgte saks");
        else System.out.println("Computeren valgte papir");

        //Her oprettes der 3 strings der fortæller om spillet er tabt, vundet eller uafgjort
        String vundet = "Tillykke! Du har vundet";
        String uafgjort = "Det blev uafgjort!";
        String tabt = "Desværre du har tabt.";

        //Her findes der en vinder ud fra 3 scenarier

        if (choiceInNumber == ssp) System.out.println(uafgjort); //hvis valgene er ens er det uafgjort
        else if (choiceInNumber == 0 && ssp == 1 || choiceInNumber == 1 && ssp == 2 || choiceInNumber == 1 && ssp == 0) System.out.println(vundet); //Her har brugeren vundet
        else System.out.println(tabt); // ellers bliver brugeren nødt til at have tabt.


    }
}
