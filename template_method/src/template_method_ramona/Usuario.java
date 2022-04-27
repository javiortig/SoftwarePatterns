package template_method_ramona;

public class Usuario {
	public static void main(String[] args) {
		
		Pedido pedidoEspagna = new PedidoEspagna();
		pedidoEspagna.setImporteSinIVA(10000);
		pedidoEspagna.calculaPrecioConIVA();
		pedidoEspagna.visualiza();

		Pedido pedidoFrancia = new PedidoFrancia();
		pedidoFrancia.setImporteSinIVA(10000);
		pedidoFrancia.calculaPrecioConIVA();
		pedidoFrancia.visualiza();
	}
}

