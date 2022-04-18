package patron_decorator_ramona;

public class MarcaDecorador extends Decorador{
	
	public MarcaDecorador(ComponenteGraficoVehiculo componente) {
		super(componente);		
	} 
	
	protected void visualizaLogo() {
		
		System.out.println("Logotipo de la marca.");
	}
	
	public void visualiza() {
		
		super.visualiza();
		this.visualizaLogo();
	}
}



