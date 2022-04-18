package factory_method_1;

public class FabricaPlaymobil extends FabricaJuguetes {
	protected Juguete creaJuguete(int numSerie) {
		return new JuguetePlaymobil(numSerie);
	}
}
