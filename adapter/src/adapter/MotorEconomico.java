package adapter;

public class MotorEconomico extends Motor{
	public MotorEconomico() {
		super();
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo motor econ�mico");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor econ�mico");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando motor econ�mico");
		
	}
}