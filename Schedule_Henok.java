import java.util.*;
/**
 * Created by Henok on 1/28/2016.
 */
public class Schedule_Henok {

    public static void main(String[] args) {

        String[][] classes = new String[4][2]; //making a String 2d array

        classes[0][0] = "CSI 111";// declaring and initizling the empty spots in the array
        classes[0][1] = "Wed 12pm";

        classes[1][0] = "SCI 211";
        classes[1][1] = "Thur 12pm";

        classes[2][0] = "MTH 311";
        classes[2][1] = "Sat 12pm";

        classes[3][0] = "ENG 411";
        classes[3][1] = "Sun 12pm";

        Scanner console = new Scanner(System.in);//Canner declartion
        boolean found = false;//boolean that is off

        while (!found){//while loop that goes on until found is true
            System.out.print("Enter Course: ");// asking for a course name and then saving it
            String name = console.nextLine();


            for (int x = 0; x < classes.length; x++) {//for loop going through the whole array
                if (name.equalsIgnoreCase(classes[x][0])) {//if it find a match it will print it out
                System.out.print("Your course is " +classes[x][0]+" on "+ classes[x][1]);
                found=true;// makes found boolean true
                break;// ends the rest of the loop
                }

            }

             if (!found) {// if it cant match the course it will write an error message
            System.out.println("Sorry that class doesnt exist");
            }


        }

    }

}
/*Enter Course: SCW 222
Sorry that class doesnt exist
Enter Course: CSI 211
Your course is CSI 211 at Thur 12pm*/


