package patron_state;

public class EstadoRojo extends EstadoSemaforo{
	public EstadoRojo(CartelLuminoso cartelLuminoso) {
		super(cartelLuminoso);
		this.cartelLuminoso.setMensajeCartel("Rojo: no pasar\n");
	}

	@Override
	public EstadoSemaforo estadoSiguiente() {
		return new EstadoVerde(this.cartelLuminoso);
	}
}
