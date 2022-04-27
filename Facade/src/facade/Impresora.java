package facade;

public class Impresora {
	String tipoDocumento;
	String hoja;
	boolean color;
	String texto;
	
	public String getTipoDocumento() {
		return this.tipoDocumento;
	}
	
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public String getHoja() {
		return this.hoja;
	}
	
	public void setHoja(String hoja) {
		this.hoja = hoja;
	}
	
	public boolean isColor() {
		return this.color;
	}
	
	public void setColor(boolean color) {
		this.color = color;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void imprimirDocumento() {
		System.out.println("imprimiendo: " + texto + ", color: " +
				color + ", tipo: " + this.tipoDocumento +  ", hoja: " + hoja);
	}
}
