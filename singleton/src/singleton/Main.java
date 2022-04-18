package singleton;

public class Main {
	public static void main(String[] args) {
		
		Database database = Database.getInstance();
		Database same_database = Database.getInstance();//wont create a new object
		
		
		//visualize name
		System.out.println(database.name);
		System.out.println(same_database.name);
		
		database.editRecord("join");
		same_database.editRecord("update");
		
		//Just in case check hashCode id to see if both objects are same
		//instance
		if(database.hashCode() == same_database.hashCode()) {
			System.out.println("They are the same!");
		}
		else {
			System.out.println("They are different!");
		}
	}
}
