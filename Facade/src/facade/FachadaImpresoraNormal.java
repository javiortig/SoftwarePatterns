package facade;

/* 
 El alumno asume que no se permite modificar la clase impresora
 y que al ser un problema pequeño y no se exige en el enunciado no
 se requiere el uso de interfaces/herencia. 
*/
public class FachadaImpresoraNormal {
		protected Impresora impresora = new Impresora();
		
		// Si no se le pasan parametros, aprovechamos el overloading de java
		// para que por defecto sea A4, Color y PDF
		void imprimirDocumento(String texto) {
			this.prepararImpresora("a4", true, "pdf", texto);
			impresora.imprimirDocumento();
		}
		
		void imprimirDocumento(String hoja, boolean color, String tipoDocumento, 
							String texto) {
			this.prepararImpresora(hoja, color, tipoDocumento, texto);
			impresora.imprimirDocumento();
		}
		
		
		// Metodo para encapsular
		private void prepararImpresora(String hoja, boolean color, String tipoDocumento, 
										String texto) {
			impresora.setHoja(hoja);
			impresora.setColor(color);
			impresora.setTipoDocumento(tipoDocumento);
			impresora.setTexto(texto);
		}
}
