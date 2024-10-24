class Wallet 
{
	int id;
	String brand;
	String color;
	int noOfCompartments;
	
	public Wallet()
	{
		this(789, "Puma");
		System.out.println("Wallet class constructor invoked");
	}
	public Wallet(int id,String brand)
	{
		this("black",3);
		System.out.println("Parameterized constructor with int and string type");
		this.id = id;
		this.brand = brand;
	}
	public Wallet(String color,int noOfCompartments)
	{
		System.out.println("Parameterized constructor with string and int type");
		this.color = color;
		this.noOfCompartments = noOfCompartments;
	}
	public void getDetails(){
		System.out.println("Wallet ID: "+this.id);
		System.out.println("Brand: "+this.brand);
		System.out.println("Number of Compartments: "+this.noOfCompartments);
		System.out.println("Color: "+this.color);
	}
}