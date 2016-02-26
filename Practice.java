/**
 * Created by Henok on 2/12/2016.
 */
public class Practice {


    public static void main  (String[] args) {

        System.out.print(whatever("Pepper"));

    }
    public static String whatever(String s) {
        char result = s.charAt(0);
        s = s.substring(1);
        s=(s+result + "ay");

        return s;
    }
}
