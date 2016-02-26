
/**
 * Created by Henok on 2/17/2016.
 */
import java.util.*;
public class PickTwoCards_Henok{


    public static void main (String [] args)
    {
        int myValue,MySuit,YourValue,YourSuit;
        final int LOW = 1;
        final int HIGH_SUIT = 3;
        String [] deck = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};//array for values
        String [] suit={"Spades","Diamonds","Clubs","Hearts"};//array for suits
        War_Henok myCard = new War_Henok();
        War_Henok YourCard = new War_Henok();//connecting to other class file


        myValue = ((int)(Math.random() * 100)%deck.length+0);
        YourValue = ((int)(Math.random() * 100)%deck.length+0);//random geneator for my card value

        MySuit = ((int)(Math.random() * 100)%suit.length+0);//for my suit kind
        YourSuit = ((int)(Math.random() * 100)%suit.length+0);

        myCard.setValue(myValue);//setting my value
        YourCard.setValue(YourValue);

        myCard.setSuit(suit[MySuit]);
        YourCard.setSuit(suit[YourSuit]);


            System.out.println("My card is "+myCard.getValue()+" of "+myCard.getSuit());//prints my card

            System.out.println("Your card is "+YourCard.getValue()+" of "+YourCard.getSuit());//prints your card



        if(myValue == YourValue && MySuit == YourSuit)//if they are the same card
        {
            System.out.print("We have the same card");
        }
        else if (myValue==YourValue)
        {
            System.out.print("Tie");
        }
        else if(myValue > YourValue)
        {
            System.out.print("I win");
        }
        else if(myValue< YourValue)
        {
            System.out.print("You Win");
        }


    }
}
/*--------------------Configuration: <Default>--------------------
My card is 3 of Spades
Your card is Ace of Hearts
You Win
Process completed.
*/







