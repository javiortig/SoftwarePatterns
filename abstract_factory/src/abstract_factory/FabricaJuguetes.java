package abstract_factory;

// las medidas y la pieza depende de la fabrica,
// la ficha del juego y lo demás es customizable
public interface FabricaJuguetes {
	Monopoly creaMonopoly();
	Playmobil creaPlaymobil(String accesorio);
	Lego creaLego(String accesorio, String sensor);
}
