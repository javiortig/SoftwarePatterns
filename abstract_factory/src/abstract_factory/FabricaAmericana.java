package abstract_factory;

public class FabricaAmericana implements FabricaJuguetes {

	@Override
	public Monopoly creaMonopoly() {
		return new Monopoly("feet", "USA-MON");
	}

	@Override
	public Playmobil creaPlaymobil(String accesorio) {
		return new Playmobil("feet", "USA-PLAY", accesorio);
	}

	@Override
	public Lego creaLego(String accesorio, String sensor) {
		return new Lego("feet", "USA-LEGO", accesorio, sensor);
	}

}
