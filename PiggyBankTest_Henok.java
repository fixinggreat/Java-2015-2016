import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Henok on 2/8/2016.
 */
public class PiggyBankTest_Henok {


    public static void main(String[] args) {

        NumberFormat money = NumberFormat.getCurrencyInstance();//dollar sign format

        PiggyBank_Henok PiggyBank= new PiggyBank_Henok(5,1,4,6);// call the class piggybank and put in numbers

                System.out.println("Pennies: "+ PiggyBank.getPenny());
                System.out.println("Nickels: "+ PiggyBank.getNickel());
                System.out.println("Dimes: "+ PiggyBank.getDime());
                System.out.println("Quarters: "+ PiggyBank.getQuarter());//get the value of quarters
                System.out.println("Total: "+ money.format(PiggyBank.calculateTotal()));//prints the value of all together

                PiggyBank.addMoney(1,1,1,1);//putting more money in

                System.out.println("New Total: "+ money.format(PiggyBank.calculateTotal()));//shows new total



    }
}

/*Pennies: 5
Nickels: 1
Dimes: 4
Quarters: 6
Total: $2.45
New Total: $3.31*/