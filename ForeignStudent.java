/**
 * Created by Henok on 3/7/2016.
 */
public class ForeignStudent extends Student {

    String Nationality;
    public ForeignStudent(int PersonAge, String PersonLocation, String PersonUniversity, String PersonNationality) {
        super(PersonAge, PersonLocation, PersonUniversity);
        Nationality=PersonNationality;
    }

    @Override
    public String toString() {
        return super.toString()+" Nationality: "+Nationality;
    }
}
