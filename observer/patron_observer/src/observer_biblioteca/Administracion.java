package observer_biblioteca;

public class Administracion implements Observer {
	static protected String name = "Administracion";
	protected Libros libros;
	
	public Administracion(Libros libros) {
		this.libros = libros;
	}
	
	@Override
	public void actualiza() {
		
		System.out.println(Administracion.name + " ha recibido la notificacion del libro " + this.libros.getTitulo());
	}
}
