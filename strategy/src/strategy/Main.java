package strategy;
import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		Context context = null;
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the type of ship (helicopter), (jet), (zeppelin): ");

	    String userName = scanner.nextLine();  // Read user input
	    scanner.close(); //close 
	    
	    switch(userName) {
	    case "helicopter":
	    	context = new Context(new Helicopter());
	    	break;
	    case "jet":
	    	context = new Context(new Jet());
	    	break;
	    case "zeppelin":
	    	context = new Context(new Zeppelin());
	    	break;
	    default:
	    	System.out.println("Invalid ship type.");
	    	return;
	    }

	    //Finally execute strategy user chose
	    context.printShip(random.nextFloat(100));
	    
	}
}
