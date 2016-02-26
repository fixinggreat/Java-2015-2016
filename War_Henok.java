/**
 * Created by Henok on 2/17/2016.
 */
public class War_Henok{

    final int LOW = 1;
    final int HIGH = 13;
    String suit;
    private int value;

    public String getSuit()
    {
        return suit;//returns suit
    }

    public int getValue()
    {
        return value;//returns value
    }

    public void setSuit(String s)
    {
        suit=s;//makes s suit
    }

    public void setValue(int v)
    {
        if(v >= LOW && v <= HIGH)//making sure the cards are positive
            value = v;
        else
            value = LOW;
    }

}


