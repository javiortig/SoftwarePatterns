package sol_con_interfaz;

import java.util.ArrayList;
import java.util.List;


public class Vehiculo implements ISujeto {

	protected List<IObservador> obs;
	protected String descripcion;
	protected Double precio;
	
	
	public Vehiculo(){
		obs = new ArrayList<IObservador>();
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		notifica();
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
		notifica();
	}

	

	@Override
	public void agrega(IObservador observador) {
		obs.add(observador);		
	}
	
	@Override
	public void elimina(IObservador observador) {
		obs.remove(observador);		
	}
	
	@Override
	public void notifica() {
		for (IObservador observador : obs)
			observador.actualiza(descripcion, precio);		
	}

}
