package adapter;

public class MotorComun extends Motor{
	public MotorComun() {
		super();
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo motor com�n");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor com�n");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando motor com�n");
		
	}
}
