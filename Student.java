/**
 * Created by Henok on 3/7/2016.
 */
public class Student extends Person {

    String University;

    public Student(int PersonAge, String PersonLocation,String PersonUniversity){
        super(PersonAge,PersonLocation);
        University=PersonUniversity;
    }

    @Override
    public String toString() {
        return super.toString()+" University: "+University;
    }
}

