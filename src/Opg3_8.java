import java.util.Scanner;

/*Opgaven lyder som følger:
(Sort three integers) Write a program that prompts the user to enter three integers and display the integers
in non-decreasing order.
jeg undersøgte hvad non-decreasing order præcist betyder, og det er ikke som man skulle tro bare at sørge for at
tallene ikke bliver større. Det er også et krav at ethvert tal i rækken ikke må være større end det forrige.
 */

public class Opg3_8 {
    public static void main(String[] args) {

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

        int first = (int) threeDigits / 100;
        int second = (int) threeDigits % 100 / 10;
        int third = threeDigits % 10;


        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println("ok");
    }
}