class Watch
{
	private String caseDiameter;
	private String bandColor;
	private String itemWeight;
	private String materialType;
	private String countryOfOrigin;
	
	public Watch()
	{
		System.out.println("Default constructor is invoked!!....");
	}
	public void setCaseDiameter(String caseDiameter)
	{
		this.caseDiameter = caseDiameter;
	}
	public String getCaseDiameter()
	{
		return caseDiameter;
	}
	public void setBandColor(String bandColor)
	{
		this.bandColor = bandColor;
	}
	public String getBandColor()
	{
		return bandColor;
	}
	public void setItemWeight(String itemWeight)
	{
		this.itemWeight = itemWeight;
	}
	public String getItemWeight()
	{
		return itemWeight;
	}
	public void setMaterialType(String materialType)
	{
		this.materialType = materialType;
	}
	public String getMaterialType()
	{
		return materialType;
	}
	public void setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getCountryOfOrigin()
	{
		return countryOfOrigin;
	}
}