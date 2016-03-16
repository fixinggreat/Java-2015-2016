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
public abstract class SportsStats {

protected String playername;
protected String Teamname;
protected int score;

    public SportsStats(String player, String Team)
    {
        playername=player;
        Teamname=Team;
        score=0;
    }
    
    public int getScore(){
        return score;
    }
    public abstract void score();
    
    public String toString(){
        String result="Player: "+playername;
        result += "\nTeam: "+Teamname;
        result += "\nScore: "+score;
        return result;
    }
            
}
