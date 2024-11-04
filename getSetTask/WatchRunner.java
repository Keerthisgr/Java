class WatchRunner
{
	public static void main(String v[])
	{
		Watch w = new Watch();
		w.setCaseDiameter("36 Millimetres");
		w.setBandColor("Rose Gold");
		w.setItemWeight("500 Grams");
		w.setMaterialType("Yellow Gold");
		w.setCountryOfOrigin("India");
		String caseDiameter = w.getCaseDiameter();
		String bandColor = w.getBandColor();
		String itemWeight = w.getItemWeight();
		String materialType = w.getMaterialType();
		String countryOfOrigin = w.getCountryOfOrigin();
		System.out.println("Case Diameter: "+caseDiameter);
		System.out.println("Band Color: "+bandColor);
		System.out.println("Item Weight: "+itemWeight);
		System.out.println("Material Type: "+materialType);
		System.out.println("Country of Origin: "+countryOfOrigin);
	}
}