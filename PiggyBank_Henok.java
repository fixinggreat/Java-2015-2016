/**
 * Created by Henok on 2/8/2016.
 */
import java.util.*;
public class PiggyBank_Henok{

    private int MyPennies=0;
    private	int MyNickel=0;
    private	int MyDime=0;
    private	int MyQuarters=0;

    public PiggyBank_Henok(int pennies,int Nickels,int Dimes, int Quarters){//a class asking you to put in 4 #

        MyPennies=pennies;//my pennies are equal to pennies
        MyNickel=Nickels;
        MyDime=Dimes;
        MyQuarters=Quarters;


    }

    public int getPenny()
    {
        return MyPennies;// returns amount of pennies
    }

    public int getNickel()
    {
        return MyNickel;
    }//returns amount of nickels
    public int getDime()
    {
        return MyDime;
    }
    public int getQuarter()
    {
        return MyQuarters;
    }

    public double calculateTotal()
    {
        double value = (MyPennies*0.01+MyNickel*.5+MyDime*.10+MyQuarters*.25);//finding the value of all the coins
        return value;
    }

    public void addMoney (int pennies, int nickels, int dimes, int quarters)//lets you add money as you please
    {
        MyPennies=MyPennies+pennies;
        MyNickel= MyNickel+nickels;
        MyDime=MyDime+dimes;
        MyQuarters=MyQuarters+quarters;
    }





}


