package decorator;

public abstract class Decorador implements ComponenteRecibirRecompensa{
	
protected ComponenteRecibirRecompensa componente;
	
	public Decorador(ComponenteRecibirRecompensa componente) {
		
		this.componente = componente;
	}
	
	public void recibirRecompensa() {
		
		componente.recibirRecompensa(); 
	}	
}
