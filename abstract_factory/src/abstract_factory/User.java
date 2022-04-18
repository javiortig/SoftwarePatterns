package abstract_factory;
import java.util.*;

public class User {
	public static void main(String[] args) {
		Juguete[] juguetes = new Juguete[6];
	
		FabricaAmericana fabricaAmericana = new FabricaAmericana();
		FabricaEuropea fabricaEuropea = new FabricaEuropea();
		
		//Fabricamos todos los juguetes de cada fabrica para ver las diferencias:
		
		juguetes[0] = fabricaAmericana.creaMonopoly();
		juguetes[1] = fabricaEuropea.creaMonopoly();
		
		juguetes[2] = fabricaAmericana.creaPlaymobil("Zapatos");
		juguetes[3] = fabricaEuropea.creaPlaymobil("Gorro");
		
		juguetes[4] = fabricaAmericana.creaLego("Pistola", "Movimiento");
		juguetes[5] = fabricaEuropea.creaLego("Espadas", "Calor");
		
		for(Juguete j: juguetes) {
			System.out.println("--------------------------");
			j.mostrarCaracteristicas();
			System.out.println("--------------------------\n");
		}
	}
}
