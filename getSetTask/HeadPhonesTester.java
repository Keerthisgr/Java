class HeadPhonesTester
{
	public static void main(String val[])
	{
		HeadPhones ref = new HeadPhones();
		ref.setBrand("boAt");
		ref.setColor("Hazel Beige");
		ref.setEarPlacement("On Ear");
		ref.setFormFactor("On Ear");
		ref.setImpedance("16 Ohm");
		String brand = ref.getBrand();
		String color = ref.getColor();
		String earPlacement = ref.getEarPlacement();
		String formFactor = ref.getFormFactor();
		String impedance = ref.getImpedance();
		System.out.println("Brand: "+brand);
		System.out.println("Color: "+color);
		System.out.println("Ear Placement: "+earPlacement);
		System.out.println("Form Factor: "+formFactor);
		System.out.println("Impedance: "+impedance);
	}
}