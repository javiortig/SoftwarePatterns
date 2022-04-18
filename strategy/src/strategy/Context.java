package strategy;

public class Context {
	   private Ship printShip;

	   public Context(Ship printShip){
	      this.printShip = printShip;
	   }

	   public void printShip(float duration){
	      printShip.print(duration);
	   }
	}
