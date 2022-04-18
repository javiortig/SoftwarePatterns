package sol_con_interfaz;

public interface ISujeto {
	
	void agrega(IObservador observador);
	void elimina(IObservador observador);
	void notifica();
}
