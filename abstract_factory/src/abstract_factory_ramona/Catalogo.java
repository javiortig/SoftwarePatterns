package abstract_factory_ramona;
import java.util.*;

public class Catalogo {

	public static int nAutos = 3;
	public static int nScooters = 2;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		FabricaVehiculo fabrica = null;
		
		Automovil[] autos = new Automovil[nAutos];
		Scooter[] scooters = new Scooter[nScooters];
		
		System.out.print("Desea utilizar " + "vehículos eléctricos (1) o de gasolina (2):");
		
		String familia = sc.next();

		if (familia.equals("1")) {
			fabrica = new FabricaVehiculoElectricidad();
		} else if (familia.equals("2")){
			fabrica = new FabricaVehiculoGasolina();
		}else {
			System.out.println("Error: Valor introducido NO válido. ");
		}
		for (int index = 0; index < nAutos; index++) {
			autos[index] = fabrica.creaAutomovil("estándar ", "amarillo ", 6 + index, 3.2);
		}
		for (int index = 0; index < nScooters; index++) {
			scooters[index] = fabrica.creaScooter("clásico ", "rojo ", 2 + index);
		}
		for (Automovil auto : autos) {
			auto.mostrarCaracteristicas();
		}
		for (Scooter scooter : scooters) {
			scooter.mostrarCaracteristicas();
		}
		sc.close();	
	}
}
