package factory_method_1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class FabricaJuguetes {

	protected List<Juguete> juguetes = new ArrayList<Juguete>();
	
	protected abstract Juguete creaJuguete(int numSerie); //factoryMethod()
	
	public void nuevoJuguete(int numSerie) {
		Juguete juguete = this.creaJuguete(numSerie);
		
		System.out.println("Juguete Creado: "+ juguete.getDescripcion());
		this.juguetes.add(juguete);
	}
	
	public boolean borrarJuguete(int numSerie) {
		Iterator<Juguete> i = juguetes.iterator();
		
		while(i.hasNext()) {
			Juguete j = i.next();
			
			if (j.numSerie == numSerie) {
				System.out.println("Juguete borrado: "+ j.getDescripcion());
				i.remove();
				return true;
			}
		}
		
		return false;
	}
	
	public void visualizarJuguetes() {
		System.out.println("Los juguetes actuales son:");
		
		for (Juguete j : this.juguetes) { 		      
			System.out.println(j.getDescripcion());		
	      }
	}
	
	
}
