package strategy;

public class Jet implements Ship{
	private float cost_per_minute = 3;
	@Override
	public void print(float duration) {
		System.out.println("Flying on a Jet:");
		System.out.println("The total bill was: " + String.valueOf(duration * cost_per_minute) + "€");
	}

}
