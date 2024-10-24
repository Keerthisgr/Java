class Wallet 
{
	int id;
	String brand;
	int noOfCompartments;
	String color;
	
	public Wallet()
	{
		System.out.println("Wallet class constructor invoked");
	}
	public Wallet(int iD,String brandName,int numOfDivisions,String clr)
	{
		id = iD;
		brand = brandName;
		noOfCompartments = numOfDivisions;
		color = clr;
	}
	public void getDetails(){
		System.out.println("Wallet ID: "+id);
		System.out.println("Brand: "+brand);
		System.out.println("Number of Compartments: "+noOfCompartments);
		System.out.println("Color: "+color);
		System.out.println("---------------------");
	}
}