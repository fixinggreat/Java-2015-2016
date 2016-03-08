/**
 * Created by Henok on 3/7/2016.
 */
import java.text.NumberFormat;
public class Employee extends Person {

    double Income;
    String Occupation;

    public Employee(int PersonAge, String PersonLocation,double PersonIncome, String PersonOccupation) {
        super(PersonAge, PersonLocation);
        Income=PersonIncome;
        Occupation=PersonOccupation;

    }

    @Override
    public String toString() {
        return super.toString()+" Income: "+NumberFormat.getCurrencyInstance().format(Income)+" Occupation: "+Occupation;
    }
}
