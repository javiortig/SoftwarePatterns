package patron_observer;

public class Usuario {
	public static void main(String[] args) {
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setDescripcion("MERCEDES");
		vehiculo.setPrecio(5000.0);
		
		VistaVehiculo vistaVehiculo = new VistaVehiculo(vehiculo);
		vehiculo.setPrecio(4500.0);
		
		VistaVehiculo vistaVehiculo2 = new VistaVehiculo(vehiculo);
		vehiculo.setPrecio(6500.0);
		
	}
}

