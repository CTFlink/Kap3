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

        int temp1=0;
        int temp2=0;
        int temp3=0;

        //Her sorteres det første tal i enten temp1, temp2 eller temp3
        if (first<second && first<third ) temp1=first;
        else if ((first<second && first>third) || (first <third && first >second)) temp2=first;
        else temp3 =first;

        //Her sorteres det andet tal
        if (second< first && second< third) temp1=second;
        else if ((second< first && second > third) || (second <third && second > first))temp2=second;
        else temp3=second;

        //Her sorteres det tredje tal
        if (third<first && third<second) temp1=third;
        else if ((third<first && third >second) || (third <second && third > first)) temp2=third;
        else temp3=third;


        System.out.println(temp3);
        System.out.println(temp2);
        System.out.println(temp1);
        System.out.println("ok");
    }
}