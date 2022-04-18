package strategy_ramona;

public class Usuario {
	public static void main(String[] args) {
		
		VistaCatalogo vistaCatalogo1 = new VistaCatalogo(new DibujaUnVehiculoPorLinea());
		vistaCatalogo1.dibuja();
		
		VistaCatalogo vistaCatalogo2 = new VistaCatalogo(new DibujaTresVehiculosPorLinea());
		vistaCatalogo2.dibuja(); 		
	}
}


