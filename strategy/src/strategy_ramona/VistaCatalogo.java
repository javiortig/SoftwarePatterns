package strategy_ramona;

import java.util.ArrayList;
import java.util.List;

public class VistaCatalogo {
	
	protected DibujaCatalogo dibujo; 
	protected List<VistaVehiculo> contenido = new ArrayList<VistaVehiculo>();

	public VistaCatalogo(DibujaCatalogo dibujo) {
		
		this.dibujo = dibujo;
		
		contenido.add(new VistaVehiculo(" SEAT"));
		contenido.add(new VistaVehiculo(" AUDI"));
		contenido.add(new VistaVehiculo(" MERCEDES"));
		contenido.add(new VistaVehiculo(" RENAULT"));
		contenido.add(new VistaVehiculo(" BMW"));
		contenido.add(new VistaVehiculo(" TOYOTA"));
		
	}

	public void dibuja() {
		dibujo.dibuja(contenido);
	}
}
