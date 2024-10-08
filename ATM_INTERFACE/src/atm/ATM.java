package atm;

import java.util.Scanner;

public class ATM {
	
	  private UserAccount account;

	    public ATM(UserAccount account) {
	        this.account = account;
	    }

	    public void displayMenu() {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nATM Menu:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Select an option: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    checkBalance();
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    account.withdraw(withdrawAmount);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM.");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	        } while (choice != 4);
	        
	        scanner.close();
	    }

	    private void checkBalance() {
	        System.out.println("Current balance: $" + account.getBalance());
	    }

}
