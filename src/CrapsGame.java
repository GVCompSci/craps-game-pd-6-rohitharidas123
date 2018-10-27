import java.util.Scanner;
public class CrapsGame 
{
	public static void main(String args[])
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int die1 = dice1.roll();
		int die2 = dice2.roll();
		boolean run = true;
		boolean game = true;
		boolean outcome = false;
		boolean input = false;
		Scanner in = new Scanner(System.in);
		
		while (game == true)
		{
			while (outcome == false)
			{
				System.out.print("Welcome to Craps. Hit enter to roll.");
				in.nextLine();
				int sum = die1 + die2;
				System.out.println("You rolled a " + sum);
				int point = sum;
				run = true;
				if ((sum == 2) || (sum == 12))
				{
					System.out.println("You lose.");
					outcome = true;
				}
				else if ((sum == 7) || (sum == 11))
				{
					System.out.println("You win.");
					outcome = true;
				}
				else
				{
					System.out.println("Your point value is " + point);
					while (run == true)
					{
						System.out.println("Press enter to roll.");
						in.nextLine();
						die1 = dice1.roll();
						die2 = dice2.roll();
						sum = die1 + die2;
						System.out.println("You rolled a " + sum + ".");
						if (sum == point)
						{
							System.out.println("You win. ");
							run = false;
							input = false;
						}
						else if (sum == 7)
						{
							System.out.print("You lose. ");
							run = false;
							input = false;
						}
					}
				}
				
			}
			while (input == false)
			{
				System.out.println("Do you want to play again? (Y/N)");
				String answer = in.nextLine();
				if (answer.equals("Y"))
				{
					outcome = false;
					input = true;
				}
				else if (answer.equals("N"))
				{
					System.out.println("Thanks for playing");
					input = true;
					game = false;
			
				}
				else
				{
					System.out.println("Invalid response. Type in 'Y' or 'N'");
				}
			}
		
		}
	}
}
