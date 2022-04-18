package abstract_factory_ramona;

public class AutomovilElectricidad extends Automovil {
	
	public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	public void mostrarCaracteristicas() {
		System.out.println("Automóvil eléctrico \n Modelo: " + modelo + "\n Color: " 
						+ color + "\n Potencia: "+ potencia + "\n Espacio: " + espacio);
	}
}
