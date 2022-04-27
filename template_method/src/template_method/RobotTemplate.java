package template_method;


//Asumimos que start y stop siempre van a ser comunes para cualquier robot
// mientras que el resto podrían variar
public abstract class RobotTemplate {
	
	
	protected abstract void getParts();
	protected abstract void assemble();
	
	/* 
	 Se da una implementacion por defecto a test pero puede modificarse mas adelante.
	 Sin embargo, start y stop no se pueden modificar, ni por supuesto go que es
	 el template method
	  */
	protected void test() {
		System.out.println("Testing product...");
	}
	

	protected final void start() {
		System.out.println("Starting...");
	}
	protected final void stop() {
		System.out.println("Stopping...");
	}
	// Este es el template method
	public final void go() {
		start();
		getParts();
		assemble();
		test();
		stop();
	}
}
