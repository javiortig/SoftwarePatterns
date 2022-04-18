package patron_observer;

public class VistaVehiculo implements Observador {
	
	protected Vehiculo vehiculo;
	protected String texto;

	public VistaVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		vehiculo.agrega(this);
	}
	
	public void actualiza() {
		texto = "Descripción: " + vehiculo.descripcion + ", Precio: " + vehiculo.precio + "€";
		System.out.println(texto);
	}
	
}
