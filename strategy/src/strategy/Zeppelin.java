package strategy;

public class Zeppelin implements Ship{
	private float cost_per_minute = 4.5f;
	@Override
	public void print(float duration) {
		System.out.println("Flying on a Zeppelin:");
		System.out.println("The total bill was: " + String.valueOf(duration * cost_per_minute) + "€");
	}

}
