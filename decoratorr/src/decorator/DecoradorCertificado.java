package decorator;

public class DecoradorCertificado extends Decorador{

	public DecoradorCertificado(ComponenteRecibirRecompensa componente) {
		
		super(componente);		
	}
	
	protected void recibirCertificado() {
		
		System.out.println("Recibo el certificado");
	}
	
	public void recibirRecompensa() {
		
		super.recibirRecompensa();
		this.recibirCertificado();
	}
}
