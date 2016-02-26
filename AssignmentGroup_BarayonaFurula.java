import java.util.Scanner;
public class AssignmentGroup_BarayonaFurula {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String FirstName;
        String LastName;


        System.out.print("Enter your first name: ");
        FirstName = console.nextLine();
        System.out.print("Enter your last name: ");
        LastName = console.nextLine();

        String LastNameLetter= LastName.substring(0,1);
        LastName = LastName.toUpperCase();
        FirstName = FirstName.toUpperCase();


        if(LastNameLetter.equals("a") || LastNameLetter.equalsIgnoreCase("b") || LastNameLetter.equalsIgnoreCase("c") || LastNameLetter.equalsIgnoreCase("f") || LastNameLetter.equalsIgnoreCase("d") || LastNameLetter.equalsIgnoreCase("g") || LastNameLetter.equalsIgnoreCase("h") || LastNameLetter.equalsIgnoreCase("i")) {
            System.out.print(FirstName + " " + LastName + " is assigned to Group 1.");
        }
       else if(LastNameLetter.equals("j") || LastNameLetter.equalsIgnoreCase("k") || LastNameLetter.equalsIgnoreCase("l") || LastNameLetter.equalsIgnoreCase("m") || LastNameLetter.equalsIgnoreCase("n") || LastNameLetter.equalsIgnoreCase("o") || LastNameLetter.equalsIgnoreCase("p") || LastNameLetter.equalsIgnoreCase("q") || LastNameLetter.equalsIgnoreCase("r") || LastNameLetter.equalsIgnoreCase("s")) {
            System.out.print(FirstName + " " + LastName + " is assigned to Group 2.");
        }
        else {
            System.out.print(FirstName + " " + LastName + " is assigned to Group 3.");
        }


    }
}
