package patron_decorator_ramona;

public class ModeloDecorador extends Decorador{

	public ModeloDecorador(ComponenteGraficoVehiculo componente) {
		
		super(componente);		
	}
	
	protected void visualizaInformacionTecnica() {
		
		System.out.println("Informaci�n t�cnica del modelo.");
	}
	
	public void visualiza() {
		
		super.visualiza();
		this.visualizaInformacionTecnica();
	}
}


