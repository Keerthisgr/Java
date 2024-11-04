class EarringsRunner
{
	public static void main(String value[])
	{
		Earrings ear = new Earrings();
		ear.setMaterialType("Metal");
		ear.setMetalType("Yellow Gold");
		ear.setGemType("Diamond");
		ear.setCountryOfOrigin("India");
		
		
		String materialType = ear.getMaterialType();
		String metalType = ear.getMetalType();
		String gemType = ear.getGemType();
		String countryOfOrigin = ear.getCountryOfOrigin();
		
		System.out.println("Material Type: "+materialType);
		System.out.println("Metal Type: "+metalType);
		System.out.println("Gem Type: "+gemType);
		System.out.println("Country of Origin: "+countryOfOrigin);
	}
}