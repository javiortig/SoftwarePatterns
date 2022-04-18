package abstract_factory;

public class Playmobil extends Juguete{
	String accesorio;

	Playmobil(String origen, String pieza, String accesorio) {
		super(origen, pieza, "Fichas del Playmobil");
		this.accesorio = accesorio;
	}
	
	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Playmobil:");
		super.mostrarCaracteristicas();
		System.out.println(" accesorio: " + accesorio);
	}
	
}
