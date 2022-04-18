package abstract_factory;

public class Monopoly extends Juguete{

	Monopoly(String origen, String pieza) {
		super(origen, pieza, "Fichas del Monopoly");
	}
	
	
	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Monopoly:");
		super.mostrarCaracteristicas();
	}
}
