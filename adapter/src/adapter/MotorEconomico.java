package adapter;

public class MotorEconomico extends Motor{
	public MotorEconomico() {
		super();
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo motor económico");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando motor económico");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando motor económico");
		
	}
}