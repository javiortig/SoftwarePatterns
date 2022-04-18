package observer_biblioteca;

public class Libros extends Sujeto {
	
	protected String titulo;
	protected boolean malEstado;
		
	public String getTitulo() {
		return titulo;
	}
	
	public Libros(String titulo) {
		this.titulo = titulo;
	}

	public boolean getEstado() {
		return malEstado;
	}

	public void devolverLibro(boolean estado, String titulo) {
		this.titulo = titulo;
		this.malEstado = estado;
		if (estado == true) {
			notify_all();
		}
		
	}
   

}
