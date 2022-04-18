package patron_sate_ramona;

public abstract class EstadoPedido {
	
	protected Pedido pedido;

	public EstadoPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public abstract void agregaProducto(Producto producto);
	public abstract void suprimeProducto(Producto producto);
	public abstract void borra();
	public abstract EstadoPedido estadoSiguiente();
}
