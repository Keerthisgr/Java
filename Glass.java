class Glass
{
	int glassId;
	String glassType;
	
	public Glass()
	{
		System.out.println("Glass constructor invoked");
	}
	public Glass(int glsId,String glsTyp)
	{
		glassId = glsId;
		glassType = glsTyp;
	}
	
	public void getGlassDetails(){
		System.out.println("Glass ID: "+glassId);
		System.out.println("Glass type: "+glassType);
		System.out.println("--------------------------");
	}
}