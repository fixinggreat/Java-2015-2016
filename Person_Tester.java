/**
 * Created by Henok on 3/7/2016.
 */
public class Person_Tester {

    public static void main(String [] args)
    {
        Person person= new Person(18,"Sioux Falls");
        Student student = new Student(18,"Sioux Falls","SDSU");
        ForeignStudent foreignStudent= new ForeignStudent(18,"Sioux Falls","SDSU","Ethiopia");
        Employee employee = new Employee(18,"Sioux Falls",8.55,"Taco Bell");

        System.out.println(person);
        System.out.println(student);
        System.out.println(foreignStudent);
        System.out.println(employee);
    }
}
/*Age: 18 Location: Sioux Falls
Age: 18 Location: Sioux Falls University: SDSU
Age: 18 Location: Sioux Falls University: SDSU Nationality: Ethiopia
Age: 18 Location: Sioux Falls Income: $8.55 Occupation: Taco Bell*/