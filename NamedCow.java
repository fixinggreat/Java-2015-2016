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
public class NamedCow extends Cow {
    private String myName;
    public NamedCow(String type, String sound){
       super(type,sound);
    }

    public NamedCow(String type , String sound, String name){
    super(type,sound);
    myName=name;
    }
 public String getName()
 {
     return myName;
 }

  
    
}
