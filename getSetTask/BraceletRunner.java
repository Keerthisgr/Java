class BraceletRunner
{
	public static void main(String value[])
	{
		Bracelet brac = new Bracelet();
		brac.setMaterialType("Metal");
		brac.setMetalType("Yellow Gold");
		brac.setSize("Standard");
		brac.setGemType("Diamond");
		brac.setCountryOfOrigin("India");
		
		
		String materialType = brac.getMaterialType();
		String metalType = brac.getMetalType();
		String size = brac.getSize();
		String gemType = brac.getGemType();
		String countryOfOrigin = brac.getCountryOfOrigin();
		
		System.out.println("Material Type: "+materialType);
		System.out.println("Metal Type: "+metalType);
		System.out.println("Size: "+size);
		System.out.println("Gem Type: "+gemType);
		System.out.println("Country of Origin: "+countryOfOrigin);
	}
}