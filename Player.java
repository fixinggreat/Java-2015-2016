/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsstats;

/**
 *
 * @author 229478
 */
public class Player {
 
    public static void main(String [] args)
    {
        
        SoccerStats player1 = new SoccerStats("Henok","Bayern");
        
        player1.GainTackles(12);
        player1.score();
        
        System.out.println(player1);
      Basketballstats player2 = new Basketballstats("Henok","Lakers");
        player2.GainSteals(2);
        player2.score();
        System.out.print(player2);
        
    
    }
    
}
