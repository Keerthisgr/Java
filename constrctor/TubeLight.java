class TubeLight
{
	int id;
	String brand;
	String voltage;
	int price;
	
	public TubeLight()
	{
		this(34,"Philips");
		System.out.println("TubeLight class constructor invoked with no arguments");
	}
	public TubeLight(int id,String brand)
	{
		this("56volts",560);
		System.out.println("Parameterized constructor with int and string type variable");
		this.id = id;
		this.brand = brand;
	}
	public TubeLight(String voltage,int price)
	{
		System.out.println("Parameterized constructor with string and int type variable");
		this.voltage = voltage;
		this.price = price;
	}
	public void getTubeLightDetails()
	{
		System.out.println("Tube Light: "+this.id);
		System.out.println("Tube Light brand: "+this.brand);
		System.out.println("Tube Light price: "+this.price);
		System.out.println("Tube Light voltage: "+this.voltage);
	}
}