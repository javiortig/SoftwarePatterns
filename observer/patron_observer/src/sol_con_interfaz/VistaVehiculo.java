package sol_con_interfaz;

public class VistaVehiculo implements IObservador {
	
	protected Vehiculo vehiculo;
	protected String texto;
	
	public VistaVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		vehiculo.agrega(this);
	}

	public void actualiza(String descripcion, double precio) {
		texto = "Descripción: " + descripcion + ", Precio: " + precio + "€";
		System.out.println(texto);
		
	}
}
