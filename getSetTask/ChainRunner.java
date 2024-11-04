class ChainRunner
{
	public static void main(String value[])
	{
		Chain c = new Chain();
		c.setMaterialType("Metal");
		c.setMetalType("Yellow Gold");
		c.setGemType("Diamond");
		String materialType = c.getMaterialType();
		String metalType = c.getMetalType();
		String gemType = c.getGemType();
		System.out.println("Material Type: "+materialType);
		System.out.println("Metal Type: "+metalType);
		System.out.println("Gem Type: "+gemType);
	}
}