class Bread
{
	String brandName;
	double price;
	int noOfSlice;
	String type;
	public Bread()
	{
		this("MTR",120.50);
		System.out.println("Constructor with no arguments");
	}
	public Bread(String brandName,double price)
	{
		this(25,"Baguette");
		System.out.println("Parameterized constructor having string and double type instance variable");
		this.brandName = brandName;
		this.price = price;
	}
	public Bread(int noOfSlice,String type)
	{
		System.out.println("Parameterized constructor having int and string type instance variable");
		this.noOfSlice = noOfSlice;
		this.type = type;
	}
	public void getInfo()
	{
		System.out.println("Bread details:");
		System.out.println("Brand name: "+this.brandName);
		System.out.println("Price: "+this.price);
		System.out.println("Number of slice: "+this.noOfSlice);
		System.out.println("Type: "+this.type);
	}
}