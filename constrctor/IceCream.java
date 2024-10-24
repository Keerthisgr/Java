class IceCream
{
	int id;
	String brand;
	String flavors;
	String type;
	String quantity;
	
	public IceCream()
	{
		this(234,"Arun");
		System.out.println("IceCream class constructor is invoked here! without any arguments");
	}
	public IceCream(int id,String brand)
	{
		this("Chocolate","Midwestern Frozen Custard","2kg");
		System.out.println("Parameterized constructor with int and string arguments");
		this.id = id;
		this.brand = brand;
	}
	public IceCream(String flavors,String type,String quantity)
	{
		System.out.println("Parameterized constructor with int, string and string arguments");
		this.flavors = flavors;
		this.type = type;
		this.quantity = quantity;
	}
	
	public void getDetails()
	{
		System.out.println("IceCream id: "+this.id);
		System.out.println("Brand: "+this.brand);
		System.out.println("Flavours: "+this.flavors);
		System.out.println("Type: "+this.type);
		System.out.println("Quantity: "+this.quantity);
	}
}