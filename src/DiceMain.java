//Write a program using the Dice class which will create two dice objects 
//and repeatedly roll until you get doubles.  Display the value of each roll 
//and their sum, and display the total number of rolls it took before getting
//doubles.
			

public class DiceMain {

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int dice1Val= dice1.roll();
		int dice2Val= dice2.roll();
		System.out.println("Die 1 rolled a: " + dice1Val + "\tDie 2 rolled a: " + dice2Val);
		System.out.println();
		int numRolls=1;
		
		while (dice1Val != dice2Val);		
			{
				int dice1Val= dice1.roll();
				int dice2Val= dice2.roll();
				System.out.println("Die 1 rolled a: " + dice1Val + "\tDie 2 rolled a: " + dice2Val);
				numRolls++;
			 }
			 	
			System.out.println("It took " + numRolls + "to get a double");
	}

}
