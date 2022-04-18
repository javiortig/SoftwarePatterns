package abstract_factory_ramona;


public class ScooterGasolina extends Scooter {
	
	public ScooterGasolina(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	public void mostrarCaracteristicas() {
		System.out.println("Scooter de gasolina \n Modelo: " + modelo + "\n Color: "
							+ color + "\n de potencia: " + potencia);
	}

}
