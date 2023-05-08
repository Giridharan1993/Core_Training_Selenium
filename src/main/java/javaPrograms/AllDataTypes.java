package javaPrograms;

//added a method is called "Action"
public class AllDataTypes {

	
	public static void main(String[] args) {
		//added a informations are called "variables"
		//Primitive datatypes boolean,byte,char,short,int,long,float,double
		System.out.println("Welcome to the Basic core Java");
		int carModelNumber = 776045;
		System.out.println("Model Number: "+carModelNumber);
		short seatingCapacity = 6;
		System.out.println("Seats: "+seatingCapacity);
		long chasisNumber = 562140000546446L;
		System.out.println("Engine Chasis Number:" +chasisNumber);
		float fuelTankCapacity = 25.35F;
		System.out.println("Fuel Tank capacity: "+fuelTankCapacity);
		double engineCapacity = 5154.256645615149654;
		System.out.println("Engine Capacity: "+engineCapacity);
		char varient = 'D';
		System.out.println("Varient: "+varient);
		boolean ispunctured = false;
		System.out.println("Punctured: "+ispunctured);
		//Derived datatype or Non Primitive datatype
		String carName = "Skoda 8 Series";
		System.out.println("Car Brand: "+carName);
		//Using multiple Object with same class name
		MultipleClassCall food = new MultipleClassCall();
		food.Beavarages();
				
	}
}
