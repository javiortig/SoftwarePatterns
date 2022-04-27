package template_method_ramona;
public abstract class Pedido {
	protected double importeSinIVA;
	protected double importeIVA;
	protected double importeConIVA;
	
	protected abstract void calculaIVA();

	// templateMethod()
	public void calculaPrecioConIVA() {
		this.calculaIVA();
		importeConIVA = importeSinIVA + importeIVA;
	}

	public void setImporteSinIVA(double importeSinIVA) {
		this.importeSinIVA = importeSinIVA;
	}

	public void visualiza() {
		System.out.println("Pedido");
		System.out.println("Importe sin IVA: " + importeSinIVA);
		System.out.println("Importe con IVA: " + importeConIVA);
	}
}
