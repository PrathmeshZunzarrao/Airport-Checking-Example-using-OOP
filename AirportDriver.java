package EncapsulationExample;

public class AirportDriver {

	public static void main(String[] args) {
		
		
		Airport a1 = new Airport("Prathmesh Zuzarrao", 98765432, 1256377836,"Pune", "International", true, 100);
		
	
		System.out.println(a1.getPassengerName());
		System.out.println(a1.getAddress());
		a1.passportCheck(false);
		a1.getBagWeight("International", 100);
		
	}

}
