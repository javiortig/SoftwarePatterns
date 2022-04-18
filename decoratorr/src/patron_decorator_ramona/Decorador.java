package patron_decorator_ramona;

public abstract class Decorador implements ComponenteGraficoVehiculo{
	
	protected ComponenteGraficoVehiculo componente;
	
	public Decorador(ComponenteGraficoVehiculo componente) {
		
		this.componente = componente;
	}
	
	public void visualiza() {
		
		componente.visualiza(); //delega la visualizaci�n en este componente
	}	

}




