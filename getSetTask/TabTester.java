class TabTester
{
	public static void main(String val[])
	{
		Tab t = new Tab();
		t.setBrand("Samsung");
		t.setModelName("Galaxy Tab S9 FE");
		t.setMemoryStorageCapacity("128 GB");
		String brand = t.getBrand();
		String modelName = t.getModelName();
		String memoryStorageCapacity = t.getMemoryStorageCapacity();
		System.out.println("Brand: "+brand);
		System.out.println("Color: "+modelName);
		System.out.println("Ear Placement: "+memoryStorageCapacity);
	}
}