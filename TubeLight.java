class TubeLight
{
	int id;
	String brand;
	int price;
	String voltage;
	
	public TubeLight()
	{
		System.out.println("TubeLight class constructor invokde");
	}
	public TubeLight(int iD, String brandName, int cost,String volt)
	{
		id = iD;
		brand = brandName;
		price = cost;
		voltage = volt;
	}
	public void getTubeLightDetails()
	{
		System.out.println("Tube Light: "+id);
		System.out.println("Tube Light brand: "+brand);
		System.out.println("Tube Light price: "+price);
		System.out.println("Tube Light voltage: "+voltage);
		System.out.println("------------------------------");
	}
}