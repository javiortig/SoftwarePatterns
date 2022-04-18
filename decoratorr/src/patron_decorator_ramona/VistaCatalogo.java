package patron_decorator_ramona;

public class VistaCatalogo {
	
	public static void main(String[] args) {
	
		VistaVehiculo vistaVehiculo = new VistaVehiculo();
		ModeloDecorador modeloDecorador = new ModeloDecorador(vistaVehiculo);
		MarcaDecorador marcaDecorador = new MarcaDecorador(modeloDecorador);
		
		marcaDecorador.visualiza();
	}
}



