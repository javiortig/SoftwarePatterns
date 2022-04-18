package singleton_ramona;


public class TestComercial {
	public static void main(String[] args) {
	
		//inicialización del comercial en el sistema, sólo se va a crear uno
		Comercial comercial1 = Comercial.instance();
		Comercial comercial2 = Comercial.instance();
		
		comercial1.setNombre("Comercial Auto");
		comercial1.setDireccion("Madrid");
		comercial1.setEmail("comercial@comerciales.com");
			
		comercial2.setNombre("Comercial Nuevo");
		comercial2.setDireccion("Las Rozas");
		comercial2.setEmail("comercialNuevo@comerciales.com");
		
		//comercial1 y comercial2 son referencias a un único objeto de la clase Comercial
		System.out.println(comercial1.getNombre());
		System.out.println(comercial2.getNombre());
		
		//muestra el comercial del sistema
		visualiza();	
		
		//comprobamos que no se puede clonar un objeto Singleton
		comercial1.clone();	  
	}

	public static void visualiza(){
		Comercial comercial = Comercial.instance();
		comercial.visualiza();
	}
}

