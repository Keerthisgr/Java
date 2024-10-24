class Pen
{
		String brandName;
		double price;
		String color;
		String materialType;
		String type;
		
		public Pen(){
			System.out.println("Constructor of class Pen is invoked!!");
		}
		
		public Pen(String bName, double p, String clr, String mtr, String ty)
		{
			brandName = bName;
			price = p;
			color = clr;
			materialType = mtr;
			type = ty;
		}
		
		public void penDetails()
		{
			System.out.println("The pen details: ");
			System.out.println("The brand name is "+brandName);
			System.out.println("The price is "+price);
			System.out.println("The color of pen is "+color);
			System.out.println("Material is "+materialType);
			System.out.println("Type of the pen is "+type);
			System.out.println();
			
		}
}