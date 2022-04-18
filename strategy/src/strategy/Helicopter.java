package strategy;

public class Helicopter implements Ship{
	private float cost_per_minute = 1;
	@Override
	public void print(float duration) {
		System.out.println("Flying on a Helicopter:");
		System.out.println("The total bill was: " + String.valueOf(duration * cost_per_minute) + "€");
	}

}
