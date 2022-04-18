package factory_method_1;

public class FabricaLego extends FabricaJuguetes {
	protected Juguete creaJuguete(int numSerie) {
		return new JugueteLego(numSerie);
	}
}
