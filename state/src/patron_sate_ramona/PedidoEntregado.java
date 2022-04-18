package patron_sate_ramona;

public class PedidoEntregado extends EstadoPedido {
	
	public PedidoEntregado(Pedido pedido) {
		super(pedido);
	}

	//En este estado el cuerpo de todos los métodos está vacío.
	public void agregaProducto(Producto producto) {
	}

	public void borra() {
	}

	public void suprimeProducto(Producto producto) {
	}

	public EstadoPedido estadoSiguiente() {
		return this;
	}
}
