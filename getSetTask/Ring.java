class Ring
{
	private int  ringSize;
	private String materialType;
	private String metalType;
	private String gemType;
	
	public Ring()
	{
		System.out.println("Default constructor is invoked!!..");
	}
	public void setRingSize(int ringSize)
	{
		this.ringSize = ringSize;
	}
	public int getRingSize()
	{
		return ringSize;
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