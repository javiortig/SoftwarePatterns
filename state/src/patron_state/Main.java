package patron_state;

public class Main {
	public static void main(String[] args) {
		CartelLuminoso cartel = new CartelLuminoso();
		cartel.visualiza();
		
		cartel.estadoSiguiente();
		cartel.visualiza();
		
		cartel.estadoSiguiente();
		cartel.visualiza();
		
		cartel.estadoSiguiente();
		cartel.visualiza();
	}
}
