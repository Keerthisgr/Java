class LaptopTester
{
	public static void main(String val[])
	{
		Laptop lap = new Laptop();
		lap.setBrand("Dell");
		lap.setModelName("Dell Gaming G16");
		lap.setScreenSize("16 inches");
		lap.setColor("Metallic nightshade");
		lap.setOperatingSystem("Windows 11 Home");
		String brand = lap.getBrand();
		String modelName = lap.getModelName();
		String screenSize = lap.getScreenSize();
		String color = lap.getColor();
		String operatingSystem = lap.getOperatingSystem();
		System.out.println("Brand: "+brand);
		System.out.println("Model name: "+modelName);
		System.out.println("Screen size: "+screenSize);
		System.out.println("Color: "+color);
		System.out.println("Operating system: "+operatingSystem);
	}
}