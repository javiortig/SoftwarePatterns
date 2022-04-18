package factory_method_1;

public class Main {
	public static void main(String[] args) {
		FabricaJuguetes fabrica;
		
		fabrica = new FabricaMonopoly();
		fabrica.nuevoJuguete(1);
		fabrica.nuevoJuguete(2);
		System.out.println();
		
		fabrica = new FabricaPlaymobil();
		fabrica.nuevoJuguete(3);
		fabrica.nuevoJuguete(4);
		fabrica.nuevoJuguete(5);
		
		fabrica.borrarJuguete(4);
		fabrica.visualizarJuguetes();
		System.out.println();
		
		fabrica = new FabricaLego();
		fabrica.nuevoJuguete(10);
		fabrica.nuevoJuguete(11);
		System.out.println();
		
		fabrica = new FabricaScalextric();
		fabrica.nuevoJuguete(20);
		fabrica.nuevoJuguete(21);
		fabrica.nuevoJuguete(21);
		System.out.println();
	}
}
