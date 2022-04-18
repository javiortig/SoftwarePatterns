package factory_method_1;

public abstract class Juguete {
	protected String descripcion;
	protected int numSerie;
	
	public Juguete(String descripcion, int numSerie) {
		this.descripcion = descripcion;
		this.numSerie = numSerie;
	}
	
	public String getDescripcion() {
		return "Juguete: " + this.numSerie + " tipo: " + this.descripcion;
	}
}
