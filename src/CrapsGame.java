import java.util.Scanner;
public class CrapsGame 
{
	public static void main(String args[])
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int die1 = dice1.roll();
		int die2 = dice2.roll();
		boolean outcome = false;
		Scanner in = new Scanner(System.in);
		System.out.print("Welcome to Craps. Hit enter to roll.");
		in.nextLine();
		while (outcome == false)
			{
			
			System.out.println("You rolled a " + die1 + " and a " + die2);
			int sum = die1 + die2;
			int point = sum;
			if ((sum == 2) || (sum == 12))
				{
					System.out.println("You lose. Do you want to play again?");
					outcome = true;
				}
			else if ((sum == 7) || (sum == 11))
				{
					System.out.println("You win. Do you want to play again? (Y/N)");
					outcome = true;
				}
			else
				{
					System.out.println("You need to roll again. Hit enter again.");
					in.nextLine();
					die1 = dice1.roll();
					die2 = dice2.roll();
					sum = die1 + die2;
					if (sum == point)
					{
						System.out.println("You win. Do you want to play again? (Y/N)");
					}
				}
			}
	}
}
