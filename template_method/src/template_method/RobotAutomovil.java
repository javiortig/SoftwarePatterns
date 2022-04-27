package template_method;

public class RobotAutomovil extends RobotTemplate{
	@Override
	protected void getParts() {
		System.out.println("Getting a carburetor...");
		
	}

	@Override
	protected void assemble() {
		System.out.println("Installing the carburetor...");
		
	}
	
	@Override
	protected void test() {
		System.out.println("Reviving the engine...");
	}
}
