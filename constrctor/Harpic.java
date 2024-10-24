class Harpic
{
	 int id;
	 String quantity;
	 double price;
	 String color;
	 String type;
	 
	 public Harpic()
	 {
		this(435,"200ml");
		System.out.println("Harpic constructor invoked with no arguments");
	 }
	 public Harpic(int id,String quantity)
	 {
		this(250.90,"Blue","Bathroom cleaner");
		System.out.println("Parameterized constructor having int and string type variable");
		this.id = id;
		this.quantity = quantity;
	 }
	 public Harpic(double price,String color,String type)
	 {
		System.out.println("Parameterized constructor having int, string and string type variable");
		this.price = price;
		this.color = color;
		this.type = type;
	 }
	 public void details()
	 {
		System.out.println("Harpic ID: "+this.id);
		System.out.println("Quantity: "+this.quantity);
		System.out.println("Price: "+this.price);
		System.out.println("Color: "+this.color);
		System.out.println("Type: "+this.type);
	 }
}