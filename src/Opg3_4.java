import java.util.Scanner;

public class Opg3_4 {
    public static void main(String[] args) {

        //Her bedes brugeren om at trykke Enter når brugeren er klar
        System.out.println("Tryk 'Enter' for at få udskrevet en tilfældig måned");

        //Her scannes der for et hvilket som helst input fra brugeren
        Scanner enter = new Scanner (System.in);
        String anything = enter.nextLine();

        //Her generes der et tilfældigt tal mellem 1-12
        int month = (int) (Math.random()*100 %12 +1);

        //Her gives der en måned ud fra hvilket tal der blev genereret ovenfor
        switch (month){
            case 1: System.out.println("januar"); break;
            case 2: System.out.println("februar"); break;
            case 3: System.out.println("marts"); break;
            case 4: System.out.println("april"); break;
            case 5: System.out.println("maj"); break;
            case 6: System.out.println("juni"); break;
            case 7: System.out.println("juli"); break;
            case 8: System.out.println("august"); break;
            case 9: System.out.println("september"); break;
            case 10: System.out.println("oktober"); break;
            case 11: System.out.println("november"); break;
            case 12: System.out.println("december");
        }

    }
}
