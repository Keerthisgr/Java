class PG
{
	 String pgOwner;
	 int rent;
	 int noOfFloors;
	 String pgAddress;
	 
	 public PG()
	 {
		 System.out.println("PG class constructor invoked: ");
	 }
	  public PG(String pGOwner,int rentAmt,int noOfFlur,String pGAddrs)
	 {
		pgOwner = pGOwner;
		rent = rentAmt;
		noOfFlur = noOfFloors;
		pgAddress = pGAddrs;
	 }
	 public void getPGDetails()
	 {
		System.out.println("PG Owner name: "+pgOwner);
		System.out.println("PG Rent: "+rent);
		System.out.println("Number of floors: "+noOfFloors);
		System.out.println("PG address: "+pgAddress);
		System.out.println("--------------------------");
	 }
}