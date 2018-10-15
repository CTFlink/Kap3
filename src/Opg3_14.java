import java.util.Scanner;

public class Opg3_14 {
    public static void main(String[] args) {

        //Flip a coin game

        //Her initialiseres lige nogle variable og en metode som programmet skal bruge
        String choice = "initialized";
        int choiceB = 3;
        Scanner input = new Scanner(System.in);
        int i=0;

        //Brugeren skal nu til at vælge plat eller krone.
        //Til det bruger jeg et while loop som fortsætter indtil brugeren har indtastet en gyldig værdi f.eks. 'plat'
        while(i<1) {
            System.out.println("plat eller krone?");

            //Her vælger brugeren plat eller krone
            choice = input.next();

            //Her undersøges det om brugerens valg er enten plat eller krone
            if (choice.equalsIgnoreCase("plat")) {
                choiceB = 0;
                i++;
            } else if (choice.equalsIgnoreCase("krone")) {
                choiceB = 1;
                i++;
            } else System.out.println("fejl i indtastning! Skriv enten 'plat' eller 'krone'");
        }

        System.out.printf("Du har valgt %s \n" , choice);

        //Her kastes mønten
        int coin = (int)(10 * Math.random()) % 2;

        //Her fortæller computeren hvad mønten landede på
        if (coin == 1) {
            System.out.println("Mønten landede på krone");}
        else System.out.println("Mønten landede på plat");

        //Her finder computeren en vinder
        if (coin == choiceB){
            System.out.println("Tillykke! Du vandt.");
        }
        else System.out.println("Desværre. Du tabte.");
    }
}
