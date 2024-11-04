class Laptop
{
	private String brand;
	private String modelName;
	private String screenSize;
	private String color;
	private String operatingSystem;
	
	public Laptop()
	{
		System.out.println("Default constructor of class laptop is invoked: ");
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setModelName(String modelName)
	{
		this.modelName = modelName;
	}
	public String getModelName()
	{
		return modelName;
	}
	public void setScreenSize(String screenSize)
	{
		this.screenSize = screenSize;
	}
	public String getScreenSize()
	{
		return screenSize;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public void setOperatingSystem(String operatingSystem)
	{
		this.operatingSystem = operatingSystem;
	}
	public String getOperatingSystem()
	{
		return operatingSystem;
	}
}