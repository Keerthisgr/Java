class OperatingSystem
{
	String name;
	String version;
	
	public OperatingSystem()
	{
		System.out.println("Operating System class constructor invoked!!");
	}
	public OperatingSystem(String nme, String vesn)
	{
		name = nme;
		version = vesn;
	}
	public void getOperatingSystemDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Version: "+version);
		System.out.println("---------------------");
	}
}