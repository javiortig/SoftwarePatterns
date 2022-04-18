package decorator;

//Basicamente tienes al ninio base y le vas añadiendo capas como una cebolla
// que son los ConcreteDecorators. Cada capa es un objeto
public class Main {
	public static void main(String[] args) {
		
		VistaNinio ninio = new VistaNinio();
		DecoradorCertificado ninioConCertificado = new DecoradorCertificado(ninio);
		
		ninioConCertificado.recibirRecompensa();
		System.out.println();
		
		DecoradorCuento ninioConCertificadoYCuento = new DecoradorCuento(ninioConCertificado);
		
		ninioConCertificadoYCuento.recibirRecompensa();
		System.out.println();
		
		
		///////////////////
		VistaNinio otroNinioBase = new VistaNinio();
		DecoradorCuento otroNinioBaseYCuento = new DecoradorCuento(otroNinioBase);
		
		otroNinioBaseYCuento.recibirRecompensa();
	}
}
