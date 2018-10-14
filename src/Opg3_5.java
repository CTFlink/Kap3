import java.util.Scanner;

public class Opg3_5 {
    public static void main(String[] args) {

        //Her bedes brugeren om input
        System.out.println("Hvilken dag er det i dag?");

        //Her scannes brugerens input og sættes ind i en string
        Scanner input = new Scanner(System.in);
        String ugedag = input.next();

        //denne int bruges til at repræsentere ugedagen via et tal mellem 0-6
        int y = 0;

        //Her assignes 'y' en værdi afhængigt af brugerens input
        switch (ugedag){
            case "mandag": y=0; break;
            case "tirsdag": y=1; break;
            case "onsdag": y=2; break;
            case "torsdag": y=3; break;
            case "fredag": y=4; break;
            case "lørdag": y=5; break;
            case "søndag": y=9; break;
            default: System.out.println("ikke gyldig ugedag. Eksempel: 'mandag'");
        }

        //Her bedes brugeren om input
        System.out.println("Hvor mange dage vil du tælle frem?");

        //Her genbruges forrige scanner og brugerens input sættes ind i integeren 'forgangneDage'
        int forgangneDage = input.nextInt();

        int ugedag2 = (y + forgangneDage) % 7;

        String ugedag3="";

        switch (ugedag2){
            case 0: ugedag3 = "mandag"; break;
            case 1: ugedag3 = "tirsdag"; break;
            case 2: ugedag3 = "onsdag"; break;
            case 3: ugedag3 = "torsdag"; break;
            case 4: ugedag3 = "fredag"; break;
            case 5: ugedag3 = "lørdag"; break;
            case 6: ugedag3 = "søndag"; break;
            default:
                System.out.println("fejl");
            }

        //Her gives svaret
        System.out.println("Hvis det er " + ugedag + " og der er gået " + forgangneDage + " dage, så er det nu " + ugedag3);



    }
}
