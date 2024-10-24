class OperatingSystem
{
	String name;
	String version;
	
	public OperatingSystem()
	{
		this("Windows","windows-11");
		System.out.println("Operating System class constructor invoked!!");
	}
	public OperatingSystem(String name,String version)
	{
		System.out.println("Parameterized constructor with two string cariables");
		this.name = name;
		this.version = version;
	}
	public void getOperatingSystemDetails()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Version: "+this.version);
	}
}