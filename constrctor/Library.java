class Library
{
	String libraryId;
	String address;
	String type;
	String libraryOwnerName;
	double price;
	
	public Library()
	{
		this("L08","5th cross RR Nagar");
		System.out.println("Library class is constructor is invoked with no arguments!!");
	}
	public Library(String libraryId, String address)
	{
		this("National","Government",456.99);
		System.out.println("Parameterized constructor with two stringa og an instance variable");
		this.libraryId = libraryId;
		this.address = address;
	}
	public Library(String type, String libraryOwnerName, double price)
	{
		this.type = type;
		this.libraryOwnerName = libraryOwnerName;
		this.price = price;
	}
	public void getLibraryDetails()
	{
		System.out.println("Library ID: "+this.libraryId);
		System.out.println("Address: "+this.address);
		System.out.println("Library type: "+this.type);
		System.out.println("Library Owner name: "+this.libraryOwnerName);
		System.out.println("Library book price: "+this.price);
	}
}
