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
public class TestFarm {
    
    public static void main(String [] args)
    {
        Cow c = new Cow("cow","moo");
        Chick h = new Chick("Chick","cluck");
        Pig p = new Pig("Pig","oink");
        System.out.println(c.getType()+" goes "+c.getSound());
        System.out.println(h.getType()+" goes "+h.getSound());
        System.out.println(p.getType()+" goes "+p.getSound());
    }
}
/*run:
cow goes moo
Chick goes cluck
Pig goes oink*/