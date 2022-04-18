package adapter;

public class MotorElectricoAdapter extends Motor {
	
	protected MotorElectrico motorElectrico = new MotorElectrico();

	@Override
	public void encender() {
		motorElectrico.conectar();
		motorElectrico.activar();
	}

	@Override
	public void apagar() {
		motorElectrico.detener();
		motorElectrico.desconectar();
	}

	@Override
	public void acelerar() {
		motorElectrico.moverMasRapido();
	}

}
