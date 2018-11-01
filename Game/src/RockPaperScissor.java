import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor 

	{

		public static void main(String[] args) 
		
			{
			Scanner scan = new Scanner(System.in);
			Random generator = new Random();

			

			System.out.println("Welcome to ROCK---PAPER---SCISSOR\n"
						     + "Let's Begin...\n\n"
						     + " ~~~~~~~~~~~~~~~~~~~~~\n"
						     + "|                     |\n"
						     + "| Type '1' for Rock   |\n"
						     + "|                     |\n"
						     + "|         or          |\n"
						     + "|                     |\n"
						     + "| Type '2' for Paper  |\n"
						     + "|                     |\n"
						     + "|         or          |\n"
						     + "|                     |\n"
						     + "| Type '3' for Scissor|\n"
						     + "|                     |\n"
						     + " ~~~~~~~~~~~~~~~~~~~~~");
			
			//GET USER INPUT
			
			int userInput = scan.nextInt();
			
	        String playerChoice; 
	        
	        //TRANSLATE USER INPUT TO RPS CHOICE
	        switch (userInput)
				        {
						case 1: 
				        	playerChoice = "ROCK"; 
				            break; 
				        case 2: 
				        	playerChoice = "PAPER"; 
				            break; 
				        case 3: 
				        	playerChoice = "SCISSOR"; 
				            break; 
				        default: 
				        	playerChoice = "Must enter your the number corrisponding with your choice "; 
				            break; 
				        }
	        
			System.out.println();
			System.out.println("**You choose " + playerChoice + "**");
			System.out.println();
			
	  
			//RANDOMLY GENERATE A RPS CHOICE FOR COM
			int rpsOptions = generator.nextInt(3)+1; 
	        String comChoice = null; 
 
	        //TRANSLATE COM CHOICE TO RPS OPTION
	        switch (rpsOptions)
	        			{
							case 1: 
								comChoice = "ROCK"; 
					            break; 
					        case 2: 
					        	comChoice = "PAPER"; 
					            break; 
					        case 3: 
					        	comChoice = "SCISSOR"; 
					            break;
	        			}
	        
	        System.out.println();
	        System.out.println();
			System.out.println("**COMPUTER chose " + comChoice + "**");
			System.out.println();
			System.out.println();
			
			
			//RPS MATCH OUTCOMES
			if (playerChoice.equals("ROCK")) 		
			{
				if (comChoice.equals("ROCK"))
				{
				System.out.print("***You have TIED with the COMPUTER***");
				}					
				else if (comChoice.equals("PAPER"))
				{
					{
					System.out.print("***You have LOST to the COMPUTER***");
					}
				}
				else if (comChoice.equals("SCISSOR"))
				{
					{
				System.out.print("***You have WON against the COMPUTER***");
					}
				}
			}
		
			
			
			if (playerChoice.equals("PAPER"))
			
			{
				if (comChoice.equals("ROCK"))
				{
					System.out.print("***You have WON against the COMPUTER***");
				}				
				else if (comChoice.equals("PAPER"))
				{
					System.out.print("***You have TIED with the COMPUTER***");
				}
				else if (comChoice.equals("SCISSOR"))
				{
					System.out.print("***You have LOST to the COMPUTER***");
				}
			}
			
			
			if (playerChoice.equals("SCISSOR"))
			
			{
				if (comChoice.equals("ROCK"))
				{
				System.out.print("***You have LOST against the COMPUTER***");
				}		
				else if (comChoice.equals("PAPER"))
				{
				System.out.print("***You have WON against the COMPUTER***");
				}					
				else if(comChoice.equals("SCISSOR"))
				{
				System.out.print("***You have TIED with the COMPUTER***");
				}
			}
			
			System.out.println();
			System.out.println();
			System.out.print(" ~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                            + "|                         |\n"
                            + "| Thank you for Playing   |\n"
				     		+ "|                         |\n"
                            + "| ROCK - PAPER - SCISSOR  |\n"
                            + "|                         |\n"
				     		+ " ~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			scan.close();
			}

	}