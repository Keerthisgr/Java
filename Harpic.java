class Harpic
{
	 int id;
	 String quantity;
	 int price;
	 String color;
	 
	 public Harpic()
	 {
		 System.out.println("Harpic constructor invoked");
	 }
	 public Harpic(int iD,String quanty,int prc,String clr)
	 {
		 id = iD;
		 quantity = quanty;
		 price = prc;
		 color = clr;
	 }
	 public void details()
	 {
		System.out.println("Harpic ID: "+id);
		System.out.println("Quantity: "+quantity);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("------------------------");
	 }
}