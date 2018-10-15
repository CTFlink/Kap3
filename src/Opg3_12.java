import java.util.Scanner;

public class Opg3_12 {
    public static void main(String[] args) {

        //opgaven handler om at undersøge om det trecifrede indtastede tal er et palindrom tal.
        // Dvs om tallet kan læses både forfra og bagfra og stadig have samme betydning

        Scanner input = new Scanner(System.in);

        int threeDigits=0;

        int i = 0;
        while (i < 1) {

            //Her assigneres brugerens input til variablen 'threeDigits'
            System.out.println("Indtast et 3 cifret tal");
            threeDigits = input.nextInt();

            //Her undersøges om brugerens input er 3 cifre langt
            int length = String.valueOf(threeDigits).length();
            if (length==3){i++;}
            else System.out.println("Dit indtastede tal skal være 3 cifre langt. Eksempelvis: '123'");
        }

        //Her deles det indtastede tal op i 3 enkelte cifre
        int first = (int) threeDigits / 100;
        int second = (int) threeDigits % 100 / 10;
        int third = threeDigits % 10;

        if (first==third) {
            System.out.println("det indtastede tal er et palindrom tal");
        }
        else System.out.println("Dit tal er ikke et palindrom tal");

    }
}
