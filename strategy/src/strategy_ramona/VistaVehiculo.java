package strategy_ramona;

public class VistaVehiculo {

	protected String descripcion;

	public VistaVehiculo(String descripcion) {
		this.descripcion = descripcion;
	}

	public void dibuja() {
		System.out.print(descripcion);
	}
}

