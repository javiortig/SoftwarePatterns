package template_method_ramona;

public class PedidoEspagna extends Pedido {
	
	protected void calculaIVA() {
		importeIVA = importeSinIVA * 0.21;
	}
}
