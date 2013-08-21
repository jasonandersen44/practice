import java.util.Scanner;
import java.util.Random;

public class practice {
	public static void main(String[] args){
		boolean playAgain = false;
		while (playAgain == false){
		//Declares variables and functions
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		//UserVariables
			int userCard1 = r.nextInt(10);
			int userCard2 = r.nextInt(10);
			int userCard3 = r.nextInt(20);
			int usersCards = (userCard1 + userCard2 + userCard3);
			int usersBet = 0;
		//DealerVariables
			int dealerCard1 = r.nextInt(10);
			int dealerCard2 = r.nextInt(10);
			int dealerCard3 = r.nextInt(10);
			int dealersCards = (dealerCard1 + dealerCard2 + dealerCard3);
			int dealersBet = r.nextInt(50);
		
			boolean betTooHigh = false;
			
		
		
		//Prints game instructions
		System.out.println("Welcome to the table! You get 3 cards. You compare the total amount of cards with the dealer, and whoever has the highest amount wins!");
		System.out.println("Good luck to you!");
		
		//Delays 4 seconds
		try {
		    Thread.sleep(4000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		//Displays users cards
		System.out.println("Your cards are, " + userCard1 + ", " + userCard2 + ", " + userCard3 + ". With a total of " + usersCards);
		
		//Initiates betting system
		while(betTooHigh == false){
		System.out.println("How much would you like to bet?(0-50)");
			usersBet = s.nextInt();
				if (usersBet > 50){
					System.out.println("Whoops, too high. Enter a number between 0 and 50");
					betTooHigh = false;
				}
				if (usersBet <= 50){
					betTooHigh = true;
				}
		}	
			
				
				
		//Displays dealer bet
		System.out.println("The dealer is betting: " + dealersBet);	
			
			
		//Displays dealers cards
		System.out.println("The dealers cards are, " + dealerCard1 + ", " + dealerCard2 + ", " + dealerCard3 + ". With a total of " + dealersCards);
		
		//Runs through win/lose/tie functions
		if (usersCards > dealersCards){
			System.out.println("Congratulations! You won!");
			System.out.println("You won, " + dealersBet + " dollars!");
		}
		
		if (usersCards < dealersCards){
			System.out.println("Ah! You lost! Better luck next time..");
			System.out.println("You lost, " + usersBet + " dollars!");
		}
		
		if (usersCards == dealersCards){
			System.out.println("Ah! Its a tie..");
			}
		System.out.println("Would you like to play again?");
		String userPlayAgain = s.nextLine();
		s.nextLine();
			if (userPlayAgain.equalsIgnoreCase("yes") || userPlayAgain.equalsIgnoreCase("yeah")){
				playAgain = true;
			}
			if (userPlayAgain.equalsIgnoreCase("no") || userPlayAgain.equalsIgnoreCase("nah")){
				System.out.println("Ok, thanks for playing!");
				
			}
		}
	}
}