package pack1;
import java.util.Random;
import java.util.Scanner;

public class Numbergame {

	
	    public static void main(String[] args) {
	    	
	    	
	    	
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int tr = 0;  // here tr is total no of rounds played by the user.
	        int rw = 0;  // and rw is the round won by the user.

	        while (true) {
	        	
	        	//setting limit the user can guess that is 100. here ntg is totol no to guess, ma is maximum attempts
	        	//and gr is right guessed no by the user.
	            int ntg = random.nextInt(100) + 1;
	            int ma = 10;
	            int attempt = 0;
	            boolean gr = false;

	            System.out.println("Hey user, What's up lets start the Game");
	            System.out.println("Ok!! so i will genrate a number between 1 and 100.");
	            System.out.println("You have " + ma + " attempts to guess it.");
	            System.out.println("Lets GO:");

	            while (attempt < ma && !gr) {
	                System.out.print("The number you have guessed enter it buddy!!: ");
	                // here ug is guess took by the user
	                int ug = scanner.nextInt();
	                attempt++;

	                if (ug < ntg) {
	                    System.out.println("Opps low! Try again.");
	                } else if (ug > ntg) {
	                    System.out.println("OHH my God it's high! Try again.");
	                } else {
	                    gr = true;
	                    System.out.println("Hurray!! You've guessed the correct number " + ntg + " in " + attempt + " attempts.");
	                }
	            }

	            if (!gr) {
	                System.out.println("OHHhh buddy!  you've used all your attempts. The number was " + ntg + "No worries better luck next time.");
	            }

	            tr++;
	            if (gr) {
	                rw++;
	            }

	            System.out.print(" Hey !! Do you want to play again? (yes/no): ");
	            String pa = scanner.next().trim().toLowerCase();
	            if (!pa.equals("yes")) {
	                break;
	            }
	        }

	        System.out.println("You have played " + tr + " rounds and won "+ rw + " times.");
	        if (tr > 0) {
	            double score = (double) rw / tr * 100;
	            System.out.printf("Your score: %.2f%%\n", score);
	        } else {
	            System.out.println("thank you  for playing buddy");
	        }

	        scanner.close();
	    }
	}

	
	
	
	

