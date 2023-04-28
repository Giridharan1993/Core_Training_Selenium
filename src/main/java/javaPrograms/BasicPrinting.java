package javaPrograms;

public class BasicPrinting {

	public void Car() {
		System.out.println("BMW series 6");
	}
	public static void main(String[] args) {
		
		//Created object to call the method, multiple methods & multiple classes
		BasicPrinting model = new BasicPrinting();
		model.Car();
		MultipleClassCall food = new MultipleClassCall();
		food.Beavarages();
		food.Transport();
		System.out.println("Manual into Automation Tester!");
		
		//Error output message
		System.err.println("Employer in the EST");
		//All data types in the objects
		AllDataTypes ADT = new AllDataTypes();
		
	}

}
