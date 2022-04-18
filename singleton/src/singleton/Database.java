package singleton;



public class Database {
	int record;
	String name;
	private static Database instance;
	
	//By overwrintting the basic constructor  with private 
	//we prevent user from
	//creating a new object from a constructor
	private Database(int record, String name) {
		this.record = record;
		this.name = name;
	}
	
	public static Database getInstance(){
		if (instance == null) {
			instance = new Database(0, "U-TAD_db");
		}
		else{
			System.out.println("Error creating object, database already instanced."); 
		}
		return instance;
	}
	
	public void editRecord(String operation) {
		System.out.println("Performing a " + operation
							+ " on record " + record +
							" in database " + name);
		
		record++;
	}
	
	public String getName() {
		return this.name;
	}
}
