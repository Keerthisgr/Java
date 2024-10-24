class Bread
{
	String brandName;
	int noOfSlices;
	String type;
	
	public Bread()
	{
		System.out.println("Bread class constructor invoked");
	}
	public Bread(String bName,int nos,String tp)
	{
		brandName = bName;
		noOfSlices = nos;
		type = tp;
	}
	
	public void getDetails()
	{
		System.out.println("Bread brand name: "+brandName);
		System.out.println("Number of slice: "+noOfSlices);
		System.out.println("Type of: "+type);
		System.out.println("----------------------------");
	}
}