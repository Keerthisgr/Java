class IceCream
{
	int id;
	String brand;
	String flavors;
	String type;
	String quantity;
	
	public IceCream()
	{
		System.out.println("IceCream class constructor is invoked here!");
	}
	public IceCream(int iD,String brd,String flvr,String typ,String qynt)
	{
		id = iD;
		brand = brd;
		flavors = flvr;
		type = typ;
		quantity = qynt;
	}
	
	public void getDetails()
	{
		System.out.println("IceCream id: "+id);
		System.out.println("Brand: "+brand);
		System.out.println("Flavours: "+flavors);
		System.out.println("Type: "+type);
		System.out.println("Quantity: "+quantity);
		System.out.println("----------------------------");
	}
}