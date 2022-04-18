package abstract_factory;

public abstract class Juguete {
	String medidas;
	String pieza;
	String ficha;
	
	Juguete(String medidas, String pieza, String ficha){
		this.medidas = medidas;
		this.pieza = pieza;
		this.ficha = ficha;
	}
	
	public void mostrarCaracteristicas() {
		System.out.println("Juguete con:\n medidas: " + medidas    
						   + "\n pieza: " + pieza + "\n ficha: " + ficha);
	}
}
