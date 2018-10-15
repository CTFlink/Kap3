public class Opg3_24 {
    public static void main(String[] args) {

        //vælg et kort program

        //Her vælges 2 værdier. En for kortet og een for kuløren
        int colorNumber = (int)Math.random() * 10 % 4;
        int cardNumber = (int)(Math.random() * 10 % 13) + 1; //Der lægges +1 til så værdien passer til kortet

        //Disse String assignes senere til at være kort
        String color = null;
        String card = null;


        //Her konverteres det valgte kulør nummer om til ovenstående color String
        switch (colorNumber){
            case 0: color = "Hjerter";
            case 1: color = "Ruder";
            case 2: color = "Klør";
            case 3: color = "Spar";
        }

        //Her konverteres det udvalgte kortnummer om til et kort i ovenstående card String
        switch (cardNumber){
            case 1: card = "Es";
            case 2: card = "To";
            case 3: card = "Tre";
            case 4: card = "Fire";
            case 5: card = "Fem";
            case 6: card = "Seks";
            case 7: card = "Syv";
            case 8: card = "Otte";
            case 9: card = "Ni";
            case 10: card = "Ti";
            case 11: card = "Knægt";
            case 12: card = "Dame";
            case 13: card = "Konge";
        }

        System.out.println("det valgte kort er :");
        System.out.println(color + " " + card);


    }
}
