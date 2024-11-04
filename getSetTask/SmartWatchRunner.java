class SmartWatchRunner
{
	public static void main(String v[])
	{
		SmartWatch sw = new SmartWatch();
		sw.setCaseDiameter("36 Millimetres");
		sw.setBandColor("Black");
		sw.setItemWeight("300 Grams");
		sw.setCountryOfOrigin("India");
		String caseDiameter = sw.getCaseDiameter();
		String bandColor = sw.getBandColor();
		String itemWeight = sw.getItemWeight();
		String countryOfOrigin = sw.getCountryOfOrigin();
		System.out.println("Case Diameter: "+caseDiameter);
		System.out.println("Band Color: "+bandColor);
		System.out.println("Item Weight: "+itemWeight);
		System.out.println("Country of Origin: "+countryOfOrigin);
	}
}