import java.util.Scanner;

public class Opg3_26 {

    //Opgaven lyder:
    /*(Use the &&, || and ^ operators) Write a program that prompts the user to enter an integer and determines whether
    it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
     */

    public static void main(String[] args) {

        //Her initialiseres nogle metoder og variable der skal bruges i programmet
        Scanner input = new Scanner(System.in);
        int number = 0;


        //Her bedes brugeren om at taste et tal hvorefter det assignes til variablen number
        System.out.println("Indtast et tal : ");
        number = input.nextInt();

        //Her opnås sandt eller falsk værdier på hvordan det indtastede tal kan deles
        boolean fiveAndSix = number % 5 == 0 && number % 6 == 0;
        boolean fiveOrSix = number % 5 == 0 || number % 6 == 0;
        boolean fiveXorSix = number % 5 == 0 ^ number % 6 == 0;

        //Her udskrives det så hvorvidt det er sandt om det indtastede tal kan divideres med 5 og 6
        System.out.println("Kan " + number + " deles med både 5 og 6 ? : " + fiveAndSix);
        System.out.println("Kan " + number + " deles med 5 eller 6 eller begge? : " + fiveOrSix);
        System.out.println("Kan " + number + " deles med enten 5 eller 6 men ikke begge? : " + fiveAndSix);


    }
}
