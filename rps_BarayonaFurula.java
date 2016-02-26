/**
 * Created by $ Henok on ${10/22/15}.
 */


  import java.util.Scanner;
  import java.util.Random;
  public class rps_BarayonaFurula

{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String Computer;

        Random rand = new Random();
        int RandomNumber = rand.nextInt(3) + 1;

        if (RandomNumber == 1) {
            Computer = "Rock";
        } else if (RandomNumber == 2) {
            Computer = "Paper";
        } else {
            Computer = "Scissors";
        }

        System.out.println("Welcome to Rock Paper Scissors! ");
        System.out.print("Input your chose of Rock, Paper, or Scissors: ");
        String UserInput = console.nextLine();

        System.out.println("You picked: " + UserInput.toUpperCase());
        System.out.println("The computer picked: " + Computer.toUpperCase());

        if ( Computer.equalsIgnoreCase(UserInput)){
            System.out.println("Its a tie!");
        } else if (UserInput.equalsIgnoreCase("rock")&& Computer.equals("Paper")) {
            System.out.println("Computer wins!");
        } else if (UserInput.equalsIgnoreCase("paper") && Computer.equals("Scissors")) {
            System.out.println("Computer wins!");
        } else if (UserInput.equalsIgnoreCase("scissors") && Computer.equals("Rock")) {
            System.out.println("Computer wins!");
        } else if (UserInput.equalsIgnoreCase("rock") && Computer.equals("Scissors")) {
            System.out.println("Player wins!");
        } else if (UserInput.equalsIgnoreCase("paper")&& Computer.equals("Rock")) {
            System.out.println("Player wins!");
        } else if (UserInput.equalsIgnoreCase("scissors") && Computer.equals("Paper")){
            System.out.println("Player wins!");
        }else{
            System.out.println("Invalid input");
        }

    }
}

