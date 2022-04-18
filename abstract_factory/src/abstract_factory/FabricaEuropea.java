package abstract_factory;

public class FabricaEuropea implements FabricaJuguetes {

	@Override
	public Monopoly creaMonopoly() {
		return new Monopoly("Metro", "EU-MON");
	}

	@Override
	public Playmobil creaPlaymobil(String accesorio) {
		return new Playmobil("Metro", "EU-PLAY", accesorio);
	}

	@Override
	public Lego creaLego(String accesorio, String sensor) {
		return new Lego("Metro", "EU-LEGO", accesorio, sensor);
	}

}