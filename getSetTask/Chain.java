class Chain
{
	private String materialType;
	private String metalType;
	private String gemType;
	
	public Chain()
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
	public void setGemType(String gemType)
	{
		this.gemType = gemType;
	}
	public String getGemType()
	{
		return gemType;
	}
}