package template_method;

public class RobotGalleta extends RobotTemplate{

	@Override
	protected void getParts() {
		System.out.println("Conseguir harina y azúcar...");
		
	}

	@Override
	protected void assemble() {
		System.out.println("Mezclando la masa...");
		
	}

}
