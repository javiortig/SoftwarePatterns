package patron_state;

public abstract class EstadoSemaforo {
	protected CartelLuminoso cartelLuminoso;
	
	public EstadoSemaforo(CartelLuminoso cartelLuminoso) {
		this.cartelLuminoso = cartelLuminoso;
	}
	
	public abstract EstadoSemaforo estadoSiguiente();
}
