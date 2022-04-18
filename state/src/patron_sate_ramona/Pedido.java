package patron_sate_ramona;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	protected List<Producto> productos = new ArrayList<Producto>();
	
	protected EstadoPedido estadoPedido;

	//El constructor inicializa el atributo estadoPedido con una instancia de la clase PedidoEnCurso. 
	public Pedido() {
		estadoPedido = new PedidoEnCurso(this);	 
	}

	public void agregaProducto(Producto producto) {
		estadoPedido.agregaProducto(producto);
	}

	public void suprimeProducto(Producto producto) {
		estadoPedido.suprimeProducto(producto);
	}

	public void borra() { // Borra el pedido.
		estadoPedido.borra();
	}

	//M�todo que pasa al estado siguiente asociando una nueva instancia al atributo estadoPedido.
	public void estadoSiguiente() {
		estadoPedido = estadoPedido.estadoSiguiente();
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void visualiza() {
		System.out.println("*Contenido del pedido*");
		for (Producto producto : productos)
			producto.visualiza();
		System.out.println();
	}
}
