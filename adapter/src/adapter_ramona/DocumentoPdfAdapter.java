package adapter_ramona;


// clase ConcreteAdapter
public class DocumentoPdfAdapter implements Documento {
	
	protected ComponentePdf herramientaPdf = new ComponentePdf();

	public void setContenido(String contenido) {
		herramientaPdf.pdfFijaContenido(contenido);
	}

	public void dibuja() {
		herramientaPdf.pdfPreparaVisualizacion();
		herramientaPdf.pdfRefresca();
		herramientaPdf.pdfFinalizaVisualizacion();
	}

	public void imprime() {
		herramientaPdf.pdfEnviaImpresora();
	}
}
