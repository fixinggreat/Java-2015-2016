/**
 * Created by Henok on 1/30/2016.
 */
public class Rate_Henok {

    public static void main(String[] args) {
        String[][] Employees = new String[5][2];//declare 2d array for employee
        double[] rate = new double[5];//1d array for the rates

        Employees[0][0] = "Molly";//initaizing all the arrays
        Employees[0][1] = "CEO";
        rate[0] = 20.00;

        Employees[1][0] = "Jeff";
        Employees[1][1] = "General Manager";
        rate[1] = 17.00;

        Employees[2][0] = "Tim";
        Employees[2][1] = "Assistant";
        rate[2] = 16.50;

        Employees[3][0] = "Alisha";
        Employees[3][1] = "Project Manager";
        rate[3] = 20.20;

        Employees[4][0] = "Tina";
        Employees[4][1] = "Develop";
        rate[4] = 15.00;

        for (int x = 0; x < Employees.length; x++)//looping through the whole array
            System.out.println("Name: " + Employees[x][0] + ", Title: " + Employees[x][1] + ", Rate: " + rate[x]);//printing out the array and rate array
    }
}
/*Name: Molly, Title: CEO, Rate: 20.0
Name: Jeff, Title: General Manager, Rate: 17.0
Name: Tim, Title: Assistant, Rate: 16.5
Name: Alisha, Title: Project Manager, Rate: 20.2
Name: Tina, Title: Develop, Rate: 15.0*/
