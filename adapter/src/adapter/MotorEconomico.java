package adapter;

public class MotorEconomico extends Motor{
	public MotorEconomico() {
		super();
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo motor econůmico");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor econůmico");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando motor econůmico");
		
	}
}