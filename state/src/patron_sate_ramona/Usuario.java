package patron_sate_ramona;

public class Usuario {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		
		pedido.agregaProducto(new Producto("Vehículo 1"));
		pedido.agregaProducto(new Producto("Accesorio 2"));
		pedido.visualiza();
		pedido.estadoSiguiente(); 
		pedido.agregaProducto(new Producto("Accesorio 3"));
		pedido.borra();
		pedido.visualiza();

		Pedido pedido2 = new Pedido();
		pedido2.agregaProducto(new Producto("Vehículo 4"));
		pedido2.agregaProducto(new Producto("Accesorio 1"));
		pedido2.visualiza();
		pedido2.estadoSiguiente();
		pedido2.visualiza();
		pedido2.estadoSiguiente();
		pedido2.borra();
		pedido2.visualiza();
	}
}

