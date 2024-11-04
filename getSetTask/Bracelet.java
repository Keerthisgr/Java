class Bracelet
{
	private String materialType;
	private String metalType;
	private String size;
	private String gemType;
	private String countryOfOrigin;
	
	public Bracelet()
	{
		System.out.println("Default constructor is invoked!!..");
	}
	public void setMaterialType(String materialType)
	{
		this.materialType = materialType;
	}
	public String getMaterialType()
	{
		return materialType;
	}
	public void setMetalType(String metalType)
	{
		this.metalType = metalType;
	}
	public String getMetalType()
	{
		return metalType;
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	public String getSize()
	{
		return size;
	}
	public void setGemType(String gemType)
	{
		this.gemType = gemType;
	}
	public String getGemType()
	{
		return gemType;
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