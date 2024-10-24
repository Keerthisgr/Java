class Glass
{
	int glassId;
	String glassType;
	int numberOfPieces;
	double price;
	
	public Glass()
	{
		this(207,"Low-E glass");
		System.out.println("Glass constructor invoked with no arguments");
	}
	public Glass(int glassId,String glassType)
	{
		this(25,25800.99);
		System.out.println("parameterized constructor with int and string type variable");
		this.glassId = glassId;
		this.glassType = glassType;
	}
	public Glass(int numberOfPieces,double price)
	{
		System.out.println("parameterized constructor with int and double type variable");
		this.numberOfPieces = numberOfPieces;
		this.price = price;
	}
	
	public void getGlassDetails(){
		System.out.println("Glass ID: "+this.glassId);
		System.out.println("Glass type: "+this.glassType);
		System.out.println("Glass pieces available: "+this.numberOfPieces);
		System.out.println("Glass cost: "+this.price);
		
	}
}