class RingRunner
{
	public static void main(String value[])
	{
		Ring r = new Ring();
		r.setRingSize(16);
		r.setMaterialType("Metal");
		r.setMetalType("Yellow Gold");
		r.setGemType("Diamond");
		
		int ringSize = r.getRingSize();
		String materialType = r.getMaterialType();
		String metalType = r.getMetalType();
		String gemType = r.getGemType();
		
		System.out.println("Ring Size: "+ringSize);
		System.out.println("Material Type: "+materialType);
		System.out.println("Metal Type: "+metalType);
		System.out.println("Gem Type: "+gemType);
	}
}