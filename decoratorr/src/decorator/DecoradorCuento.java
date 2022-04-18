package decorator;

public class DecoradorCuento extends Decorador {
	
	public DecoradorCuento(ComponenteRecibirRecompensa componente) {
			
			super(componente);		
	}
	
	protected void recibirCuento() {
			
		System.out.println("Recibo el cuento porque soy el mejor");
	}
	
	public void recibirRecompensa() {
		
		super.recibirRecompensa();
		this.recibirCuento();
	}
}
