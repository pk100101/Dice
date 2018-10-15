import java.util.Scanner;

//Write a program which creates two Dice objects.  
//Prompts the user for a target value between 2 and 12.  
//Make sure that the target value is valid.  
//If it is not, prompt the user again.  
//Roll the two dice until the target is rolled.  
//Display each roll and their sum, and display the total number of rolls 
//before the target was reached. 
public class DiceMain2 
{
	public static void main (String[] args)
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int dice1Val= dice1.roll();
		int dice2Val= dice2.roll();
		int sum = dice1Val + dice2Val;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Input target value:");
		int target = scanner.nextInt();
		boolean correctInput = false;
		
		while (!correctInput)
		{
				if (target<2 || target>12)
			{
				System.out.println("Error: Invalid input, try again");
			}
		}
		scanner.nextLine();
		
		int numRolls =  0;
		while (dice1Val + dice2Val != target)
		{
			dice1.roll();
			System.out.println("You rolled a: " + dice1Val);
			dice2.roll();
			System.out.println("You rolled a: " + dice2Val);
			System.out.println("Sum of rolls = " + sum );
			numRolls++;
			System.out.println("Total rolls: " + numRolls);
		}
		
		 System.out.println("It took " + numRolls + "for the sum of the die to equal target value" );
		
	}

}
