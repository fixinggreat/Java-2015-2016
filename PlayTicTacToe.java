/**
 * Created by Henok on 6/3/2016.
 */
public class PlayTicTacToe {

    public static void main(String [] args)
    {
        TicTacToe Game = new TicTacToe();
        int counter = 1;
        while(Game.GameActive()&&counter<10) {
            if(counter %2 ==0)
                Game.AskPlayer('2');
            else
                Game.AskPlayer('1');
            counter++;

            System.out.print("\n");
            Game.DisplayBoard();
            Game.checkForWinner();
            System.out.println("\n");

            if(counter == 10)
            {
                System.out.println("Tie!");
            }

         }
    }
}
