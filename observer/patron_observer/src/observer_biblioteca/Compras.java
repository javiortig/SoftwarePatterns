package observer_biblioteca;

public class Compras implements Observer {
	static protected String name = "Compras";
	protected Libros libros;
	
	public Compras(Libros libros) {
		this.libros = libros;
	}
	
	@Override
	public void actualiza() {
		
		System.out.println(Administracion.name + " ha recibido la notificacion del libro " + this.libros.getTitulo());
	}
}
