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
public class Farm {
    
    private Animal[] a = new Animal [3];
    Farm()
    {
        a[0] = new Cow("cow","moo");
        a[1] = new Chick("chick","cluck");
        a[2] = new Pig("pig","oink");
    }
    public void animalSounds()
    {
        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i].getType()+" goes "+a[1].getSound());
        }
        System.out.println("The cow is known as " +((NamedCow)a[0]).getName());
    }
}
