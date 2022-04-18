package singleton_ramona;

public class Comercial implements Cloneable{
	
	private String nombre;
	private String direccion;
	private String email;

	private static Comercial instancia = null;

	//constructor privado para evitar q se genere un constructor público por defecto
	private Comercial() {
	}

	public static Comercial instance(){
		if (instancia == null) {
			instancia = new Comercial();
		}
		else{
			System.out.println("Error al crear el comercial, ya existe un objeto de este tipo."); 
		}
		return instancia;
	}

	public void visualiza() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Email: " + email);
	}

	@Override
	public Comercial clone() {
	    try {
	        throw new CloneNotSupportedException();
	    } catch (CloneNotSupportedException ex) {
	        System.out.println("¡No se puede CLONAR un objeto Singleton!");
	        System.out.println(ex);
	    }
	    return null; 		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

