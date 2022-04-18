package adapter;

public class MotorElectrico {
	private boolean conectado;
	
	public MotorElectrico() {
		this.conectado = false;
	}
	
	public void conectar() {
		this.conectado = true;
		System.out.println("Conectando motor el�ctrico");
			
	}
	
	public void activar() {
		if(!this.conectado) {
			System.out.println("No se puede activar porque no est� " +
					"conectado el motor el�ctrico");
		}
		else {
			System.out.println("Conectado, activando motor el�ctrico");
			
		}
	}
	
	public void moverMasRapido() {
		if(!this.conectado) {
			System.out.println("No se puede mover m�s r�pido porque no est� " +
					"conectado el motor el�ctrico");
		}
		else {
			System.out.println("Conectado, aumentando el voltaje " + 
						"para mover m�s r�pido el motor el�ctrico");
			
		}
	}
	
	public void detener() {
		if(!this.conectado) {
			System.out.println("No se puede detener el motor porque no est� " +
					"conectado");
		}
		else {
			System.out.println("Deteniendo el motor el�ctrico");
			
		}
	}
	
	public void desconectar() {
		this.conectado = false;
		System.out.println("Desconectando el motor el�ctrico");
	}
}
