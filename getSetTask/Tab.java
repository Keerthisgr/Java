class Tab
{
	private String brand;
	private String modelName;
	private String memoryStorageCapacity;
	
	public Tab()
	{
		System.out.println("Default constructor is invoked!!..");
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
	public void setMemoryStorageCapacity(String memoryStorageCapacity)
	{
		this.memoryStorageCapacity = memoryStorageCapacity;
	}
	public String getMemoryStorageCapacity()
	{
		return memoryStorageCapacity;
	}
}