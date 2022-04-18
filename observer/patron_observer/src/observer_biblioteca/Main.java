package observer_biblioteca;

public class Main {
	public static void main(String[] args) {
		
		Libros biblioteca = new Libros("El cid");
		
		Stock stock = new Stock(biblioteca);
		Administracion administracion = new Administracion(biblioteca);
		Compras compras = new Compras(biblioteca);
		
		biblioteca.suscribe(stock);
		biblioteca.suscribe(administracion);
		biblioteca.suscribe(compras);
		
		biblioteca.devolverLibro(true, "Cathy Vipi");
		
		biblioteca.unsuscribe(administracion);
		
		biblioteca.devolverLibro(true, "Era elxocas");
	}
}