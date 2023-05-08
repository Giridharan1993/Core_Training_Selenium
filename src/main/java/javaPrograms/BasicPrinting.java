package javaPrograms;

public class BasicPrinting {

	public void Car() {
		System.out.println("BMW series 6");
		System.out.println("Manual into Automation Tester!");
		//Error output message
		System.err.println("Employer in the EST");
	}
	public static void main(String[] args) {
		
		//Created object to call the method, multiple methods & multiple classes
		BasicPrinting model = new BasicPrinting();
		model.Car();
		//Created classes MultipleClassCall.java
		MultipleClassCall food = new MultipleClassCall();
		food.Beavarages();
		food.Transport();
		
		
		
	}

}
