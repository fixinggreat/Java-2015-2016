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
public class SoccerStats extends SportsStats {
protected int tackles;
    
 public SoccerStats(String player, String Team)
 {
    super(player,Team); 
 }

@Override
 public void score(){
     score+=1;
 }
 
 public void GainTackles(int numtackles){
     tackles+=numtackles;
 }
 
 public int getTackles(){
     return tackles;
 }
 
}