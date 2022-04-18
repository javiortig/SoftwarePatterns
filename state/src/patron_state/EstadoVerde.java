package patron_state;

public class EstadoVerde extends EstadoSemaforo{
	public EstadoVerde(CartelLuminoso cartelLuminoso) {
		super(cartelLuminoso);
		this.cartelLuminoso.setMensajeCartel("Verde: puede pasar\n");
	}

	@Override
	public EstadoSemaforo estadoSiguiente() {
		return new EstadoAmbar(this.cartelLuminoso);
	}
}