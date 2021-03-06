/**
 * @author Bharavi Misra
 * Craps Game
 * Period 6
 */

import java.util.Scanner;
public class CrapsMain 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		DiceClass dice1 = new DiceClass();
		DiceClass dice2 = new DiceClass();
		
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int point = roll1 + roll2;
		int sum;
		boolean response =  true;
		String input;
		
		while (response)
		{
			System.out.println("Welcome to craps! Enter to roll!");
			in.nextLine();
			System.out.println("Your roll: " + roll1 + " + " + roll2 + " =  " + point);
			
			if (point == 7 || point == 11)
				System.out.println("You win!");
			else if (point == 2 || point == 12)
				System.out.println("You Lose!");
			else 
			{
				do {
						System.out.println("Enter to roll: ");
						in.nextLine();
						roll1 = dice1.roll();
						roll2 = dice2.roll();
						sum = roll1 + roll2;
						System.out.println("Your roll: " + roll1 + " + " + roll2 + " =  " + sum);
						
					} while (sum != 2 && sum != point);
					
					if (sum == 2)
						System.out.println("You lose!");
					else {System.out.println("You win!");}
			}
			
			System.out.print("Want to play again? Y for yes, N for no: ");
			input = in.next();
			while (! input.equals("Y") && ! input.equals("N"))
			{
				System.out.print("Invalid response. Y for yes, N for no: ");
				input = in.next();
			}
			if (input.equals("Y"))
				response = true;
			else 
			{
				System.out.print("Goodbye!");
				response = false;
			}
		}

	}

}
