package facade_ramona;
import java.util.*;

public interface Catalogo {
	
	List<String> buscaVehiculos(int precioMin, int precioMax);
}

