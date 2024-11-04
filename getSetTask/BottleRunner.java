class BottleRunner
{
	public static void main(String arg[])
	{
		Bottle b = new Bottle();
		b.setBrand("Symactive");
		b.setMaterial("Plastic");
		b.setBottleType("Standard Bottle");
		b.setColor("Multi-color");
		b.setCapacity("1 litres");
		String brand = b.getBrand();
		String material = b.getMaterial();
		String bottleType = b.getBottleType();
		String color = b.getColor();
		String capacity = b.getCapacity();
		System.out.println("Brand: "+brand);
		System.out.println("Material: "+material);
		System.out.println("Bottle Type: "+bottleType);
		System.out.println("Color: "+color);
		System.out.println("Capacity: "+capacity);
	}
}