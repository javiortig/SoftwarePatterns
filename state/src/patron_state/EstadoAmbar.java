package patron_state;

public class EstadoAmbar extends EstadoSemaforo {
	public EstadoAmbar(CartelLuminoso cartelLuminoso) {
		super(cartelLuminoso);
		this.cartelLuminoso.setMensajeCartel("Ambar: pasar con moderacion\n");
	}

	@Override
	public EstadoSemaforo estadoSiguiente() {
		return new EstadoRojo(this.cartelLuminoso);
	}
}
