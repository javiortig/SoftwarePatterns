package factory_method_ramona;


public class Usuario {
	public static void main(String[] args) {
		
		Cliente cliente;
		
		cliente = new ClienteContado();
		cliente.nuevoPedido(2000.0);
		cliente.nuevoPedido(10000.0);
		
		cliente = new ClienteCredito();
		cliente.nuevoPedido(2000.0);
		cliente.nuevoPedido(10000.0); //no se crea ya que al ser >5000€ no se valida
	}
}
