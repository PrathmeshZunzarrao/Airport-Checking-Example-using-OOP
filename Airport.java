package EncapsulationExample;

public class Airport {
		
		static String airlinesName = "Air-Asia";
		
		
		private String passengerName;
		private long phoneno;
		private long adharno;
		private String address;
		private String travelType;
		private boolean passport;
		private double bagWeight;
		
		public Airport() {
			// TODO Auto-generated constructor stub
		}
		
		public Airport(String passengerName,long phoneno,long adharno, String address,String travelType,boolean passport, double bagWeight)
		{
			
			this.passengerName = passengerName;
			this.phoneno = phoneno;
			this.adharno = adharno;
			this.address = address;
			this.travelType = travelType;
			this.passport = passport;
			this.bagWeight = bagWeight;
			
			System.out.println("Airport Checking");
		}

		public String getPassengerName() {
			return passengerName;
		}

		

		public long getPhoneno() {
			return phoneno;
		}

		

		public long getAdharno() {
			return adharno;
		}

		

		public String getAddress() {
			return address;
		}

		

		public String getTravelType() {
			return travelType;
		}

		

		public boolean isPassport() {
			return passport;
		}

		

		public void getBagWeight(String travelType, double bagweight) {

			if(travelType=="Domestic" && bagWeight > 21)
			{
				System.out.println("Overloaded Bags"+"\n"+"Bages with more than 21kg are not allowed");
			}
			else if(travelType=="International" && bagWeight > 52) {
				System.out.println("Overloaded Bags"+"\n"+"Bages with more than 52kg are not allowed");
			}
			else
			{
				System.out.println("Bages verified");
				System.out.println("luggage Desk Passed");
			}
		}
		
		public void passportCheck(boolean passport)
		{
			if(travelType=="Domestic")
			{
				System.out.println("Passport not required");
			}
			else
			{
				 if(travelType=="International")
				 {
					 if(passport)
						{
							System.out.println("Passport verified");
						}
						else
						{
							System.out.println("Not allowed to board , You don't have valid passport");
						}
				 }
			}
		}

		
		
		
		
		
		
		
}
