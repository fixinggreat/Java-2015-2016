/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsstats;


public class Basketballstats extends SportsStats {
protected int steals;
    
 public Basketballstats(String player, String Team)
 {
    super(player,Team); 
 }

@Override
 public void score(){
     score+=2;
 }
 
 public void GainSteals(int numSteals){
     steals+=numSteals;
 }
 
 public int getSteals(){
     return steals;
 }
 
}