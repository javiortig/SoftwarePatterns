package factory_method_ramona;


public class ClienteCredito extends Cliente {
	
	protected Pedido creaPedido(double importe) {
		return new PedidoCredito(importe);
	}
}
