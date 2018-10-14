import java.util.Scanner;

public class Opg3_2 {

    public static void main(String[] args) {

     //Her initialiseres der 3 forskellige random numbers mellem 1-10
     int num1 = (int)(Math.random()*10+1);
     int num2 = (int)(Math.random()*10+1);
     int num3 = (int)(Math.random()*10+1);

     //her scannes der for bruger input
     Scanner input = new Scanner (System.in);

     //Her bedes der om et svar
     System.out.println("hvad giver " + num1 + " + " + num2 + " + " + num3 + " ? ");

     //Her bliver det modtagne input assignet til variablen "answer1"
     int answer1 = input.nextInt();

     if (num1+num2+num3==answer1){
         System.out.println("dit svar er korrekt");}
     else System.out.println("dit svar er forkert");

     }
}
