package factory_method_ramona;


public class ClienteContado extends Cliente {
	
	protected Pedido creaPedido(double importe) {
		return new PedidoContado(importe);
	}
}


