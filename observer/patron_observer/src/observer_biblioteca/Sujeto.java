package observer_biblioteca;

import java.util.*;

public abstract class Sujeto {
	
	protected List<Observer> observers = new ArrayList<Observer>();
	
	public void suscribe(Observer observador) {
		observers.add(observador);
	}

	public void unsuscribe(Observer observador) {
		observers.remove(observador);
	}

	public void notify_all() {
		for (Observer observador : observers)
			observador.actualiza();
	}

}