package strategy_ramona;

import java.util.List;

public class DibujaUnVehiculoPorLinea implements DibujaCatalogo {

	public void dibuja(List<VistaVehiculo> contenido) {
		
		System.out.println("Dibuja los veh�culos mostrando un veh�culo por l�nea:");
		
		for(int i=1; i<contenido.size(); i++) {
			contenido.get(i).dibuja();
			System.out.println();
		}
		System.out.println();
	}
}
