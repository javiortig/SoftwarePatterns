package sol_con_interfaz;

public class Usuario {
	public static void main(String[] args) {
		
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setDescripcion("SEAT");
		vehiculo.setPrecio(9500.0);
				
		VistaVehiculo vistaVehiculo = new VistaVehiculo(vehiculo);
		vehiculo.setDescripcion("TOYOTA");
		vehiculo.setPrecio(8500.0);

	}
}
