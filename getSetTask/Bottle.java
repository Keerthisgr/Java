class Bottle
{
	private String brand;
	private String material;
	private String bottleType;
	private String color;
	private String capacity;
	
	public Bottle()
	{
		System.out.println("Default constructor is invoked!...");
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setMaterial(String material)
	{
		this.material = material;
	}
	public String getMaterial()
	{
		return material;
	}
	public void setBottleType(String bottleType)
	{
		this.bottleType = bottleType;
	}
	public String getBottleType()
	{
		return bottleType;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public void setCapacity(String capacity)
	{
		this.capacity = capacity;
	}
	public String getCapacity()
	{
		return capacity;
	}
}