package facade;

// Como se puede apreciar hemos podido encapsular el codigo bastante respecto al original

public class Cliente {
	public static void main(String[] args) {
		FachadaImpresoraNormal interfazImpresora = new FachadaImpresoraNormal();
		
		interfazImpresora.imprimirDocumento("texto 1");
		
		interfazImpresora.imprimirDocumento("texto 2");
		
		
		interfazImpresora.imprimirDocumento("a3", false, "excel", "texto 3");
	}
}
