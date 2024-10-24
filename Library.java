class Library
{
	String libraryId;
	String address;
	String type;
	String libraryOwnerName;
	
	public Library()
	{
		System.out.println("Library class is constructor is invoked!!");
	}
	public Library(String libId,String add,String typ,String libOwnerName)
	{
		libraryId = libId;
		address = add;
		type = typ;
		libraryOwnerName = libOwnerName;
	}
	public void getLibraryDetails()
	{
		System.out.println("Library ID: "+libraryId);
		System.out.println("Address: "+address);
		System.out.println("Library type: "+type);
		System.out.println("Library Owner name: "+libraryOwnerName);
		System.out.println("----------------------------------");
	}
}