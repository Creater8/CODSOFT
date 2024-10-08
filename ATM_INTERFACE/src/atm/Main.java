package atm;

import java.util.Scanner;

	
	 public class Main { 
	    
		 public static void main(String[] args) {
		        UserAccount userAccount = new UserAccount(1000.00); // Initial balance
		        ATM atm = new ATM(userAccount);
		        atm.displayMenu();
		    }
	}



