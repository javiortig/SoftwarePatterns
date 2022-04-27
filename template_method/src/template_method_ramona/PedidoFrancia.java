package template_method_ramona;

public class PedidoFrancia extends Pedido {
	
	protected void calculaIVA() {
		// 12% servicios
		// 15% productos. Consideramos sólo productos
		
		importeIVA = importeSinIVA * 0.15;		
	}
}
