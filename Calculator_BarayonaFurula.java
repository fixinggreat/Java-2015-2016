import java.util.Scanner;
public class Calculator_BarayonaFurula {

    public static void main (String[]args){

        Scanner console = new Scanner(System.in);
        double FirstNumber;
        double SecondNumber;


        System.out.print("Enter First Number: ");
        FirstNumber=console.nextDouble();
        System.out.print("Enter Second Number: ");
        SecondNumber=console.nextDouble();

        System.out.print("Enter operation (Add, Subtract, Multiply, or Divide): ");
        String Operation=console.next();


        if (Operation.equalsIgnoreCase("Add"))
        {
            System.out.print(FirstNumber+" + "+SecondNumber+(" = "+(FirstNumber+SecondNumber)));
        }
        else if (Operation.equalsIgnoreCase("Subtract"))
        {
            System.out.print(FirstNumber+" - "+SecondNumber+(" = "+(FirstNumber-SecondNumber)));
        }
        else if (Operation.equalsIgnoreCase("Multiply"))
        {
            System.out.print(FirstNumber+" * "+SecondNumber+(" = "+(FirstNumber*SecondNumber)));
        }
        else if (Operation.equalsIgnoreCase("Divide") && SecondNumber==0)
        {
            System.out.print("Error: dividing by zero is undefined");
        }
        else if (Operation.equalsIgnoreCase("Divide"))
        {
            System.out.print(FirstNumber+" / "+SecondNumber+(" = "+(FirstNumber/SecondNumber)));
        }
        else
            System.out.println("Invalid input");

    }

}
