package abstract_factory_ramona;


public class ScooterElectricidad extends Scooter {
	
	public ScooterElectricidad(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	public void mostrarCaracteristicas() {
		System.out.println("Scooter el�ctrica \n Modelo: " + modelo    
						   + "\n Color: " + color + "\n Potencia: " + potencia);
	}

}
