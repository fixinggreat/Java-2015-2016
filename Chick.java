/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oldmacdonald;

/**
 *
 * @author 229478
 */
public class Chick implements Animal {
 private String myType;
 private String mySound;
 private String myChildishSound;
 
  public Chick(String type, String sound){
        myType = type;
        mySound = sound;
    }
 public Chick(String type , String sound1, String sound2){
    this(type,sound2);
    myChildishSound=sound1;
    }
 
  public String getSound()
   {
        return mySound;
    }
    public String getType()
    {
        return myType;
    }
}
