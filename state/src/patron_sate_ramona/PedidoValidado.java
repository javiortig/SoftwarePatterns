package patron_sate_ramona;

public class PedidoValidado extends EstadoPedido {
	
	public PedidoValidado(Pedido pedido) {
		super(pedido);
	}

	public void agregaProducto(Producto producto) { //Como ya está validado no se pueden agregar productos		
	}
	
	public void borra() {
		pedido.getProductos().clear();
	}

	public void suprimeProducto(Producto producto) {
	}

	public EstadoPedido estadoSiguiente() {
		return new PedidoEntregado(pedido);
	}
}
