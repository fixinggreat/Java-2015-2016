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
public class Cow implements Animal {
    
    private String myType;
    private String mySound;
    
   
    
    public Cow(String type, String sound){
        myType = type;
        mySound = sound;
    }
    
    public String getSound(){
        return mySound;
    }
    public String getType()
    {
        return myType;
    }
}
