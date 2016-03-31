/**
 * Created by Henok on 3/31/2016.
 */
public class ReverseNum {

    public static void reversDigits(int number) {
        if (number < 10) {
            System.out.print(number);
            return;
        }
        else {
            System.out.print(number % 10);
            reversDigits(number/10);
        }
    }

    public static void main(String [] args)
    {
        reversDigits(59999);
    }
}
