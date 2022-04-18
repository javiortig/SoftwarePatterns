package factory_method_1;

public class FabricaScalextric extends FabricaJuguetes {
	protected Juguete creaJuguete(int numSerie) {
		return new JugueteScalextric(numSerie);
	}
}