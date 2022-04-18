package abstract_factory;

public class Lego extends Juguete{
	String accesorio;
	String sensor;

	Lego(String origen, String pieza, String accesorio, String sensor) {
		super(origen, pieza, "Fichas del lego");
		this.accesorio = accesorio;
		this.sensor = sensor;
	}
	
	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Lego:");
		super.mostrarCaracteristicas();
		System.out.println(" accesorio: " + accesorio    
						   + "\n sensor: " + sensor);
	}
	
}

