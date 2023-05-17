package javaPrograms;

public class MultipleClassCall {
	// Multiple methods to call in single object
	private String hungry = "Double pepper onion pizza";
	public void Bevarages() {
		System.out.println("Drinking coffee...");
	}

	public void Transport() {
		System.out.println("Metro Train");
	}

	public static void main(String[] args) {

		MultipleClassCall food = new MultipleClassCall();
		food.Bevarages();
		food.Transport();
		System.out.println(food.hungry);
		
	}
}
