package template_method_ramona;

public class PedidoFrancia extends Pedido {
	
	protected void calculaIVA() {
		// 12% servicios
		// 15% productos. Consideramos s�lo productos
		
		importeIVA = importeSinIVA * 0.15;		
	}
}
