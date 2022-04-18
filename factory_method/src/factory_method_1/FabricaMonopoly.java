package factory_method_1;

public class FabricaMonopoly extends FabricaJuguetes {
	protected Juguete creaJuguete(int numSerie) {
		return new JugueteMonopoly(numSerie);
	}
}