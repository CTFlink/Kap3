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

        int k = 0;
        while (k < 1) {
            //Her assignes brugerens input til variablen 'threeDigits'
            System.out.println("Indtast et 3 cifret tal");
            threeDigits = input.nextInt();

            //Her undersøges om brugerens input er 3 cifre langt
            int length = String.valueOf(threeDigits).length();
            if (length==3){k++;}
            else System.out.println("Dit indtastede tal skal være 3 cifre langt. Eksempelvis: '123'");
        }

        int first = (int) threeDigits / 100;
        int second = (int) threeDigits % 100 / 10;
        int third = threeDigits % 10;

        //Her declares 3 nye variable som tallene skal sorteres ind i

        int temp1=first;
        int temp2=second;
        int temp3=third;

        //Her sorteres 'first' over i enten temp2 eller temp3 hvis den er større
        if (first > second){

            if (first > third) temp3=first;
            else if (first<third) temp2=first;
        }
        else if (first > third){
            if (first < second)temp2=first;
        }

        //Her sorteres 'second' over i enten temp1 eller temp3
        if (second > third && second > first) temp3 = second;
        else if (second < first && second < third) temp1 = second;

        //Her sorteres 'third' over i enten temp1 eller temp2
        if (third < second && third <first)temp1 = third;
        else if (third < second || third < first) temp2 = third;

        System.out.println(temp3);
        System.out.println(temp2);
        System.out.println(temp1);
        System.out.println("ok");
    }
}