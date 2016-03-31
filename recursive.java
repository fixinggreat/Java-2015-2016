/**
 * Created by Henok on 3/31/2016.
 */
public class recursive {

    public static String reverseString(String s){
        if (s.length() == 0)
            return s;

        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static  void  main(String [] args)
    {
        System.out.print(reverseString("Genokfs"));
    }
}
