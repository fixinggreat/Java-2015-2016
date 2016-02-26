import java.util.Scanner;
import java.text.*;
	public class BarayonaFurula_Order
	{
		public static void main (String [] args)
		{
			final double TAX_RATE = .065; //6.5% sales tax
	
			Scanner console = new Scanner(System.in);

            NumberFormat money = NumberFormat.getCurrencyInstance();

			double hamBurger; //burger prices 
			hamBurger = 1.69;

			double frenchFries; //fries price
			frenchFries = 1.09;

			double pop; //soda price
			pop = .99;
			
			System.out.print("Enter the number of burgers: ");// Asking for amount of burgers
			int NumberBurgers = console.nextInt();// stores their answers

			System.out.print("Enter the number of fries: ");// Asking for amount of fries
			int NumberFries = console.nextInt();// stores their answers

			System.out.print("Enter the number of sodas: ");// Asking for amount of sodas
			int NumberSodas = console.nextInt();// stores their answers

			double burgersFinal = hamBurger * NumberBurgers;// Finds the final prices for burgers by multiplying
			double FriesFinal = frenchFries * NumberFries; // Finds the final prices for fries by multiplying
			double SodaFinal = pop * NumberSodas;// Finds the final prices for sodas by multiplying
            double TotalBefore = burgersFinal + FriesFinal + SodaFinal; // Adding all the total up
            double Tax = (TotalBefore * TAX_RATE); // finding the tax of the totalBefore
            double TotalCost= Tax + TotalBefore; // Adding tax to the totalBefore for the total amount of everything


            System.out.println("Your total before tax: " +money.format(TotalBefore));// Printing out totalBefore tax

            System.out.println("Tax: "+money.format(Tax));// Printing out the amount of tax

            System.out.println("Total Cost: "+ money.format(TotalCost));// Printing out total with the money sign



		}
	}