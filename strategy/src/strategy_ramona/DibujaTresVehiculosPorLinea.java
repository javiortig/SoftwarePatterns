package strategy_ramona;

import java.util.List;

public class DibujaTresVehiculosPorLinea implements DibujaCatalogo {

	public void dibuja(List<VistaVehiculo> contenido) {
		int contador;
		
		System.out.println("Dibuja los vehículos mostrando tres vehículos por línea:");
		contador = 0;
		
		for (VistaVehiculo vistaVehiculo : contenido) {
			vistaVehiculo.dibuja();
			contador++;
			if (contador == 3) {
				System.out.println();
			} 
		}
	}
}
