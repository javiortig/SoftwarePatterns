package template_method;

public class Main {
	public static void main(String[] args) {
		RobotGalleta robotGalletas = new RobotGalleta();
		robotGalletas.go();
		
		
		System.out.println("     ");
		RobotAutomovil robotAutomovil = new RobotAutomovil();
		robotAutomovil.go();
	}
	
}
