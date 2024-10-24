class PG
{
	 String pgOwner;
	 int rent;
	 int noOfFloors;
	 String pgAddress;
	 
	 public PG()
	 {
		this("Smitha",6000);
		System.out.println("PG class constructor invoked: ");
	 }
	  public PG(String pgOwner,int rent)
	 {
		this(3,"SriNagar");
		System.out.println("String pgOwner int rent are used");
		this.pgOwner = pgOwner;
		this.rent = rent;
	 }
	  public PG(int noOfFloors,String pgAddress)
	{
		System.out.println("Int or slice rent are used");
		this.noOfFloors = noOfFloors;
		this.pgAddress = pgAddress;
	}
		public void getPGDetails()
	 {
		System.out.println("PG Owner name: "+this.pgOwner);
		System.out.println("PG Rent: "+this.rent);
		System.out.println("Number of floors: "+this.noOfFloors);
		System.out.println("PG address: "+this.pgAddress);
	 }
}