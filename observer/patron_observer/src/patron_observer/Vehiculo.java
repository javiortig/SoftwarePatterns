package patron_observer;

public class Vehiculo extends Sujeto {

	protected String descripcion;
	protected Double precio;
		
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		notifica();
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
		notifica();
	}

}
