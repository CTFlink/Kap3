import java.util.Scanner;

public class kap3Exercises {

    public static void main(String[] args) {

        //___________________________
        // Listing 3,4
        int y=1;
        int x=1;
        if (y>1){x=1;}

        //___________________________
        //Listing 3,5
        double pay=1;
        int score=90;
        if (score>90){pay= pay*1.03;}

        //___________________________
        //Listing 3,6
        if (score>90){pay=1.03*pay;}
        else {pay=1.03*pay;}

        //___________________________
        //Listing 3,12
        //rewrite the following:
        //if (count % 10 == 0)  newLine = true; else  newLine = false;
        int count=9;
        boolean newLine = count % 10 == 0;
        System.out.println(newLine);

        //___________________________
        //Listing 3,16
        double random = Math.random()*10;
        System.out.println("  double : " + random);
        System.out.println("a (0-19) : " + (int)(random*10)%20);
        System.out.println("b (10-20) : " + (int)(random+10));
        System.out.println("c (10-50) : " + (int)((random*10)%41+10));
        System.out.println("d (0-1)   : " + (int)random%2);

        //___________________________
        //Listing 3,19
        int num =102;
        boolean cond = num >= 1 && num <= 100;
        System.out.println("er "+num+" mellem 1-100? : "  + cond);

        //___________________________
        //Listing 3,20
        boolean exp = x - 5 < 4.5;


        //___________________________
        // 3.8 Lotteri spil
        //her rulles der et random lotto nr.
        int lottery = (int)(Math.random() * 100);

        //her spørges brugeren om at vælge et lotteri tal
        System.out.print("Enter your lottery pick (two digits): ");
        Scanner input = new Scanner(System.in);

        //Her bliver brugerens input proppet ned i en int.
        // For nemhedens skyld har jeg også lavet et permanent gæt så programmet er nemmere at teste
        int guess = input.nextInt();
        int staticGuess = 17;

        //Her laves der 2 lotto tal ud fra ovenstående lotto tal
        int lotteryDigit1 = lottery / 10; //her opsamles det første tal (ti'eren)
        int lotteryDigit2 = lottery % 10; //her opsamles det første tal (en'eren)

        //Her gribes brugerens gæt
        int guessDigit1 = guess / 10; //her opsamles det første tal (ti'eren)
        int guessDigit2 = guess % 10; //her opsamles det andet tal (en'eren)

        System.out.println("The lottery number is " + lottery);

        //Her evalueres spillet
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else System.out.println("Sorry, no match");



    }
}
