package facade_ramona;
import java.util.*;

public class ComponenteCatalogo implements Catalogo {

	//La base de datos que constituye el cat�logo se reemplaza por un array de objetos
	protected Object[] descripcionVehiculo = { "Berlina 5 puertas", 6000, "Compacto 3 puertas", 4000,
												"Espace 5 puertas", 8000, "Familiar 5 puertas", 7000, 
												"Coup� 2 puertas", 9000, "Utilitario 3 puertas", 5000 };

	//busca uno o varios veh�culos en funci�n de su precio 
	public List<String> buscaVehiculos(int precioMin, int precioMax) {
		
		int indice, tama�o;
		List<String> resultado = new ArrayList<String>();
		tama�o = descripcionVehiculo.length / 2;
		
		for (indice = 0; indice < tama�o; indice++) {
			int precio = (Integer) descripcionVehiculo[2 * indice + 1];
			if ((precio >= precioMin) && (precio <= precioMax))
				resultado.add((String) descripcionVehiculo[2 * indice]);
		}
		return resultado;
	}
}
