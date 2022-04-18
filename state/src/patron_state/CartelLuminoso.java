package patron_state;

public class CartelLuminoso {
	protected EstadoSemaforo estadoSemaforo;
	private String mensajeCartel;
	
	public CartelLuminoso() {
		this.estadoSemaforo = new EstadoRojo(this);	
	}
	
	public void estadoSiguiente() {
		this.estadoSemaforo = this.estadoSemaforo.estadoSiguiente();
	}
	
	public void setMensajeCartel(String msg) {
		this.mensajeCartel = msg;
	}
	
	public String getMensajeCartel() {
		return this.mensajeCartel;
	}
	
	public void visualiza() {
		System.out.println("-----Cartel Luminoso-----");
		System.out.println(mensajeCartel);
		System.out.println("-------------------------");
		System.out.println();
	}
}
