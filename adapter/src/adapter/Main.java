package adapter;

public class Main {
	public static void main(String[] args) {
		Motor motorElectrico, motorComun, motorEconomico;
		
		motorComun = new MotorComun();
		motorEconomico = new MotorEconomico();
		motorElectrico = new MotorElectricoAdapter();
		
		
		motorComun.encender();
		motorComun.acelerar();
		motorComun.apagar();
		
		System.out.println("");
		
		motorEconomico.encender();
		motorEconomico.acelerar();
		motorEconomico.apagar();
		
		System.out.println("");
		
		motorElectrico.encender();
		motorElectrico.acelerar();
		motorElectrico.apagar();
	}
}
