package observer_biblioteca;

public class Stock implements Observer {
	static protected String name = "Stock";
	protected Libros libros;
	
	public Stock(Libros libros) {
		this.libros = libros;
	}
	
	@Override
	public void actualiza() {
		
		System.out.println(Administracion.name + " ha recibido la notificacion del libro " + this.libros.getTitulo());
	}
}
