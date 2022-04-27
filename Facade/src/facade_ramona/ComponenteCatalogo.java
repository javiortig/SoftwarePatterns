package facade_ramona;
import java.util.*;

public class ComponenteCatalogo implements Catalogo {

	//La base de datos que constituye el catálogo se reemplaza por un array de objetos
	protected Object[] descripcionVehiculo = { "Berlina 5 puertas", 6000, "Compacto 3 puertas", 4000,
												"Espace 5 puertas", 8000, "Familiar 5 puertas", 7000, 
												"Coupé 2 puertas", 9000, "Utilitario 3 puertas", 5000 };

	//busca uno o varios vehículos en función de su precio 
	public List<String> buscaVehiculos(int precioMin, int precioMax) {
		
		int indice, tamaño;
		List<String> resultado = new ArrayList<String>();
		tamaño = descripcionVehiculo.length / 2;
		
		for (indice = 0; indice < tamaño; indice++) {
			int precio = (Integer) descripcionVehiculo[2 * indice + 1];
			if ((precio >= precioMin) && (precio <= precioMax))
				resultado.add((String) descripcionVehiculo[2 * indice]);
		}
		return resultado;
	}
}
