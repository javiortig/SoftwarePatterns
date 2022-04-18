package abstract_factory_ramona;

public class AutomovilGasolina extends Automovil {
	public AutomovilGasolina(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	public void mostrarCaracteristicas() {
		System.out.println("Automóvil de gasolina \n Modelo: " + modelo + "\n Color: " + color
						+ "\n Potencia: " + potencia + "\n Espacio: " + espacio);
	}
}
