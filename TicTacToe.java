import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private char [][] gameBoard;
    private boolean gameOnGoing=true;
    public TicTacToe(){
        gameBoard= new char[3][3];
        for(int row=0;row<gameBoard.length;row++)
        {
            Arrays.fill(gameBoard[row], ' ');
        }
    }

    public void DisplayBoard()
    {
        for(int row=0;row<gameBoard.length;row++)
        {
            for(int col=0;col<gameBoard[0].length;col++)
            {
                System.out.print(gameBoard[row][col]);
                if (col==0 || col==1)
                    System.out.print("\t|");

            }
            if(row == 0 || row == 1)
                System.out.print("\n---------------\n");

        }
    }

    public boolean makeMove(char player,int row, int col)
    {
        if(row>=0 && row <=2 &&col>= 0 && col<=2) {


            if (gameBoard[row][col] != ' ') {
                return false;
            }

            else{
                gameBoard[row][col]= player;
                return true;
            }

        }
        return false;
    }

    public boolean GameActive()
    {
        return gameOnGoing;
    }

    public  void AskPlayer(char player)
    {
        Scanner console = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.print("Player "+player+" please enter a row (1-3): ");
            row = console.nextInt();

            System.out.print("Player "+player+" please enter a column (1-3): ");
            col = console.nextInt();

        }while(notValid(row,col));

        makeMove(player,row-1,col-1);
    }

    public boolean notValid(int row,int col)
    {
        if (row>3||row<1||col>3||col<1||!isEmpty(row,col))
            return true;

        else
        return false;
    }

    public boolean isEmpty(int row, int col)
    {
        if(gameBoard[row-1][col-1]==' ')
        {
            return true;
        }

        else
        {
            System.out.println("That position is already taken!");
            return false;
        }
    }
    public boolean checkForWinner()
    {
        for(int row=0;row<gameBoard.length;row++) {
            if (gameBoard[row][0] == gameBoard[row][1] && gameBoard[row][1] == gameBoard[row][2]&& gameBoard[row][0]!=' ')
            {
                System.out.println("The winner is "+gameBoard[row][0]);
                return gameOnGoing=false;
            }
        }
        for(int col=0;col<gameBoard[0].length;col++){
            if(gameBoard[0][col]==gameBoard[1][col] && gameBoard[1][col]==gameBoard[2][col] && gameBoard[0][col]!=' ')
            {
                System.out.print("The winner is "+gameBoard[0][col]);
                return gameOnGoing=false;
            }
        }

        if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] && gameBoard[0][0] !=' ')
        {
            System.out.println("The winner is "+gameBoard[0][0]);
            return gameOnGoing = false;

        }

        if(gameBoard[2][0]==gameBoard[1][1]&&gameBoard[1][1] == gameBoard[0][2]&& gameBoard[1][1]!=' ')
        {
            System.out.println("The winner is "+gameBoard[1][1]);
        }

        return false;

    }


}