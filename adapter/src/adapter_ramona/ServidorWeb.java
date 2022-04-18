package adapter_ramona;


public class ServidorWeb {
	public static void main(String[] args) {
		Documento documento1, documento2;
		
		documento1 = new DocumentoHtml();
		documento1.setContenido("Hello");
		documento1.dibuja();
		documento1.imprime();
		System.out.println();
		
		documento2 = new DocumentoPdfAdapter();
		documento2.setContenido("Hola");
		documento2.dibuja();
		documento2.imprime();
	}
}
