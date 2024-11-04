class HeadPhones
{
	private String brand;
	private String color;
	private String earPlacement;
	private String formFactor;
	private String impedance;
	
	public HeadPhones()
	{
		System.out.println("Default constructor is invoked here!!..");
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public void setEarPlacement(String earPlacement)
	{
		this.earPlacement = earPlacement;
	}
	public String getEarPlacement()
	{
		return earPlacement;
	}
	public void setFormFactor(String formFactor)
	{
		this.formFactor = formFactor;
	}
	public String getFormFactor()
	{
		return formFactor;
	}
	public void setImpedance(String impedance)
	{
		this.impedance = impedance;
	}
	public String getImpedance()
	{
		return impedance;
	}
}